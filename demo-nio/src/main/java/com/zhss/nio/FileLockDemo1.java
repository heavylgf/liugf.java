package com.zhss.nio;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * Created by CTWLPC on 2019/3/8.
 */
public class FileLockDemo1 {
    // 我自己加独占锁  自己写自己读也是可以的  另一个人不加锁，读写都是不行的
    public static void main(String[] args) throws Exception {
        // 底层加入RandomAccessFile 共享锁和独占锁都可以加的
        RandomAccessFile file = new RandomAccessFile("F:\\development\\tmp\\hello.txt", "rw");
//        FileInputStream in = new FileInputStream("F:\\development\\tmp\\hello.txt");
        // 通过一个底层的BIO时代的一些流，输入流，输出流随机读写文件
        // 调用他们的getchannel()方法，获取到FileChannel
        FileChannel channel = file.getChannel();
//        channel.position();

        // true代表上共享锁,false代表独占锁
        // 其实共享锁和独占锁是互斥的
        FileLock lock = channel.lock(0, Integer.MAX_VALUE, false); // 会阻塞住，会等待别人释放共享锁了，自己才能成功加独占锁
//        channel.lock(0, Integer.MAX_VALUE, true);
        System.out.println("加锁成功");

        // 加入共享锁之后，测试看看是否能读到, 在来一个人看是否成功：还是会成功的
//        System.out.println(channel.read(ByteBuffer.allocate(100)));

        // 加了共享锁之后 测试自己和别人写数据看是否成功 :  肯定是不行的，会报错
        channel.write(ByteBuffer.wrap("abc".getBytes()));
        //  基于force强制从os cache 刷入数据到磁盘
        channel.force(true);
        System.out.println(channel.read(ByteBuffer.allocate(100)));

        Thread.sleep(60 * 60 * 1000);

        lock.release(); // 释放锁
        channel.close();
        file.close();

    }

}
