package com.yidiandian.thread.pool;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: 一点点
 * @Date: 2019/4/11 10:52
 * @Version 1.0
 */
public class JoinCountDownLatch {

    //创建一个CountDownLatch 实例
    private static volatile CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread( new Runnable() {
            @Override
            public void run() {
              try{
                  Thread.sleep( 1000 );
              }catch (InterruptedException e){
                  e.printStackTrace();
              }finally {
                  countDownLatch.countDown();
              }
                System.out.println("child threadOne over");
            }
        } );

        Thread threadTwo = new Thread( new Runnable() {
            @Override
            public void run() {
              try{
                  Thread.sleep( 1000 );
              }catch (InterruptedException e){
                  e.printStackTrace();
              }finally {
                  countDownLatch.countDown();
              }
                System.out.println("child threadTwo over");
            }
        } );
        //启动子线程
        threadOne.start();
        threadTwo.start();
        System.out.println("wait all child thread over");
        //等待子线程执行完毕，返回
        countDownLatch.await();
        System.out.println("all child thread over");
    }
}
