package com.yidiandian.thread;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: 一点点
 * @Date: 2019/4/9 10:34
 * @Version 1.0
 * 线程安全的list
 */
public class ReentrantLockList {

    //线程不安全的list
    private ArrayList<String> array = new ArrayList<>();
    //独占锁
    private volatile ReentrantLock lock = new ReentrantLock(  );
    //添加元素
    public void add(String em){
        lock.lock();
        try{
            array.add( em );
        }finally {
            lock.unlock();
        }
    }
    //删除元素
    public void remove(String em){
        lock.lock();
        try{
            array.remove( em );
        }finally {
            lock.unlock();
        }
    }
    //获取数据
    public String get(int index){
        lock.lock();
        try{
          return   array.get( index );
        }finally {
            lock.unlock();
        }
    }
}
