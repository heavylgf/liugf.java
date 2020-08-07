package com.zhss.demo.concurrent;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁
 * Created by CTWLPC on 2019/1/21.
 */
public class ReadWriteLockDemo {

    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

        // 加入读锁和释放锁
        lock.readLock().lock();
        lock.readLock().unlock();

        // 加入写锁和释放锁
        lock.writeLock().lock();
        lock.writeLock().unlock();

        // 但是，读锁和写锁是互斥的，也就是说，你加了读锁之后，就不能加写锁；
        // 如果加了写锁，就不能加读锁
        // 如果有人在读数据，就不能有人写数据，读锁 -> 写锁 -> 互斥
        // 如果有人在写数据，别人不能写数据，写锁 -> 写锁 -> 互斥；
        // 如果有人在写数据，别人也不能读数据，写锁 -> 读锁 > 互斥

    }

}
