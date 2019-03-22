package com.yidiandian.thread;

/**
 * @Author: 一点点
 * @Date: 2019/3/22 9:49
 * @Version 1.0
 */
public class InterrutedTest {

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread( new Runnable() {
            @Override
            public void run() {
              for (;;){

              }
            }
        });

        //启动线程
        threadOne.start();
        //设置中断标志
        threadOne.interrupt();
        //获取中断标志
        System.out.println("isInterrupted:"+threadOne.isInterrupted());
        //获取中断标志并重置
        System.out.println("isInterrupted:"+threadOne.isInterrupted());
        //获取中断标志并重置
        System.out.println("isInterrupted:"+Thread.interrupted());
        //获取中断标志
        System.out.println("isInterrupted:"+threadOne.isInterrupted());
        threadOne.join();
        System.out.println("main thread is over");
    }
}
