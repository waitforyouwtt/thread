package com.yidiandian.thread;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: 一点点
 * @Date: 2019/3/24 16:19
 * @Version 1.0
 */
public class AtomicLongTest {
    //创建long 原子计数器
    private static AtomicLong atomicLong = new AtomicLong(  );
    //创建数据源
    private static Integer[] arrayOne = new Integer[]{0,1,23,456,7890};
    private static Integer[] arrayTwo = new Integer[]{0,1,23,4,5,67,8,9};

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread( new Runnable() {
            @Override
            public void run() {
             int size = arrayOne.length;
                for (int i = 0; i < size; i++) {
                    if (arrayOne[i].intValue() == 0){
                        atomicLong.incrementAndGet();
                    }
                }
            }
        } );

        Thread threadTwo = new Thread( new Runnable() {
            @Override
            public void run() {
              int size = arrayTwo.length;
                for (int i = 0; i < size; i++) {
                    if (arrayTwo[i].intValue() == 0){
                        atomicLong.incrementAndGet();
                    }
                }
            }
        } );
        //启动线程
        threadOne.start();
        threadTwo.start();
        //等待线程执行完毕
        threadOne.join();
        threadTwo.join();
        System.out.println("count 0:"+atomicLong.get());
    }
}
