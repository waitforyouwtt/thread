package com.yidiandian.thread;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: 一点点
 * @Date: 2019/4/9 7:13
 * @Version 1.0
 */
public class LockSupportTest {

    /*public static void main(String[] args) {
        *//**
         * 只有begin 没有end，线程被挂起，因为默认情况下调用线程是不持有许可证的。
         *//*
        System.out.println("begin support");
        //使当前线程获取到许可证
        LockSupport.unpark(Thread.currentThread());
        //再次调用park方法
        LockSupport.park();
        System.out.println("end support");
    }*/
    /*public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread( new Runnable() {
            @Override
            public void run() {
                System.out.println("child thread begin park");
                //调用park()方法，挂起自己
                LockSupport.park();
                System.out.println("child thread end park");
            }
        } );
        //启动子线程   主线程休眠1s
        thread.start();
        Thread.sleep( 1000 );
        System.out.println("main thread begin unpark");
        //调用unpark 方法让thread 线程持有许可证，然后park方法返回
        LockSupport.unpark( thread );
    }*/

/*    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread( new Runnable() {
            @Override
            public void run() {
                System.out.println("child thread begin park");
                while (!Thread.currentThread().isInterrupted()){
                    //调用park()方法，挂起自己,只有被中断才会退出循环
                    LockSupport.park();
                }
                System.out.println("child thread end park");
            }
        } );
        //启动子线程   主线程休眠1s
        thread.start();
        Thread.sleep( 1000 );
        System.out.println("main thread begin unpark");
        //中断子线程
        thread.interrupt();
    }*/
    public static void main(String[] args) {

    }
}
