package com.yidiandian.thread;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: 一点点
 * @Date: 2019/4/9 10:46
 * @Version 1.0
 * 多线程下的安全list
 */
public class ReentrantReadWriteLockList {

    //线程不安全的list
    private ArrayList<String> array = new ArrayList<>();
    //独占锁
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(  );
    private final Lock readLock = lock.readLock();
    private final Lock writeLock =lock.writeLock();
    //添加元素
    public void add(String em){
        writeLock.lock();
        try{
            array.add( em );
        }finally {
            writeLock.unlock();
        }
    }
    //删除元素
    public void remove(String em){
        writeLock.lock();
        try{
            array.remove( em );
        }finally {
            writeLock.unlock();
        }
    }
    //获取数据
    public String get(int index){
        readLock.lock();
        try{
            return   array.get( index );
        }finally {
            readLock.unlock();
        }
    }
}
