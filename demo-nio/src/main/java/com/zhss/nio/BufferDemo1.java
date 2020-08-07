package com.zhss.nio;

import java.nio.ByteBuffer;

/**
 * Created by CTWLPC on 2019/3/6.
 */
public class BufferDemo1 {

    public static void main(String[] args) throws Exception {
        byte[] data = new byte[]{55, 56, 57, 58, 59};
        // 加入缓冲区
        ByteBuffer buffer = ByteBuffer.wrap(data);

//        buffer = ByteBuffer.allocate(10); // 创建一个大小10的空buffer
//        buffer = ByteBuffer.allocateDirect(10);  // 通过direct模式创建缓冲区


        System.out.println("capacity：" + buffer.capacity());
        System.out.println("limit：" + buffer.limit());
        System.out.println("position：" + buffer.position());

        // 读取缓冲区的数据
        System.out.println("缓冲区数据：" + buffer.get());// 把当前position所在位置的数据读取一位出来
        System.out.println("position---：" + buffer.position());
        buffer.mark(); // 将position = 1 的时候打标记

//        buffer.position(3);
//        buffer.limit(3);

        buffer.position(3); // 设置position
        System.out.println("缓冲区数据--：" + buffer.get());
        System.out.println("position---：" + buffer.position());

        buffer.reset(); // 复位position = 1
        System.out.println("position---：" + buffer.position());

    }

}
