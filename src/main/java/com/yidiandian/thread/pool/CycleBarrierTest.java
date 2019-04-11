package com.yidiandian.thread.pool;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: 一点点
 * @Date: 2019/4/11 15:28
 * @Version 1.0
 */
public class CycleBarrierTest {

    //创建一个CyclicBarrier实例，添加一个所有子线程全部到达屏障后执行的任务
    private static CyclicBarrier cyclicBarrier = new CyclicBarrier( 2, new Runnable() {
        @Override
        public void run() {
            System.out.println(Thread.currentThread()+"task1 merge result");
        }
    } );

    public static void main(String[] args) {
        //创建一个线程个数固定为2 的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit( new Runnable() {
            @Override
            public void run() {
              try{
                  System.out.println(Thread.currentThread()+"task1-1");
                  System.out.println(Thread.currentThread()+"enter in barrier");
                  cyclicBarrier.await();
                  System.out.println(Thread.currentThread()+"enter out barrier");
              }catch (Exception e){
                  e.printStackTrace();
              }
            }
        } );

        executorService.submit( new Runnable() {
            @Override
            public void run() {
                try{
                    System.out.println(Thread.currentThread()+"task1-2");
                    System.out.println(Thread.currentThread()+"enter in barrier");
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread()+"enter out barrier");
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        } );
        //关闭线程池
        executorService.shutdown();
    }
}
