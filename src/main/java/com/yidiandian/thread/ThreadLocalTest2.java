package com.yidiandian.thread;

/**
 * @Author: 一点点
 * @Date: 2019/3/22 20:20
 * @Version 1.0
 */
public class ThreadLocalTest2 {

    //创建线程变量
    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set( "hello world" );
        //启动子线程
        Thread thread = new Thread( new Runnable() {
            @Override
            public void run() {
                System.out.println("thread:"+threadLocal.get());
            }
        } );
        thread.start();
        System.out.println("main:"+threadLocal.get());
    }
}
