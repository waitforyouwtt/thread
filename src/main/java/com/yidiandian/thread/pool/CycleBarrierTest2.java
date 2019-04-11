package com.yidiandian.thread.pool;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: 一点点
 * @Date: 2019/4/11 15:46
 * @Version 1.0
 */
public class CycleBarrierTest2 {
    //创建一个CyclicBarrier 实例
    private static CyclicBarrier cyclicBarrier = new CyclicBarrier( 2 );
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit( new Runnable() {
            @Override
            public void run() {
              try{
                  System.out.println(Thread.currentThread()+"step1");
                  cyclicBarrier.await();
                  System.out.println(Thread.currentThread()+"step2");
                  cyclicBarrier.await();
                  System.out.println(Thread.currentThread()+"step3");
                  cyclicBarrier.await();
              }catch (Exception e){
                  e.printStackTrace();
              }
            }
        } );

        executorService.submit( new Runnable() {
            @Override
            public void run() {
                try{
                    System.out.println(Thread.currentThread()+"step1");
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread()+"step2");
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread()+"step3");
                    cyclicBarrier.await();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        } );
        //关闭线程池
        executorService.shutdown();
    }
}
