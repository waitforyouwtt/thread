package com.yidiandian.thread;

/**
 * @Author: 一点点
 * @Date: 2019/3/22 10:52
 * @Version 1.0
 */
public class DaemonTest {
    public static void main(String[] args) {
        Thread daemonThread = new Thread( new Runnable() {
            @Override
            public void run() {
                System.out.println("-----------------");
            }
        } );
        //设置为守护线程
        daemonThread.setDaemon( true );
        daemonThread.start();

        Thread thread = new Thread( new Runnable() {
            @Override
            public void run() {
               for (;;){

               }
            }
        } );
        //启动子线程
        thread.start();
        System.out.println("main thread is over");
    }
}
