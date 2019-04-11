package com.yidiandian.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @Author: 一点点
 * @Date: 2019/4/11 17:13
 * @Version 1.0
 */
public class SemaphoreTest {
    private  static Semaphore semaphore = new Semaphore( 10 );
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit( new Runnable() {
            @Override
            public void run() {
              try{
                  System.out.println(Thread.currentThread()+"over");
                  semaphore.release();
              }catch (Exception e){
                  e.printStackTrace();
              }
            }
        } );
        executorService.submit( new Runnable() {
            @Override
            public void run() {
              try{
                  System.out.println(Thread.currentThread()+"over");
                  semaphore.release();
              }catch (Exception e){
                  e.printStackTrace();
              }
            }
        } );
        //等待子线程执行完毕，返回
        semaphore.acquire(2);
        System.out.println("all child thread over");
        //关闭线程池
        executorService.shutdown();
    }
}
