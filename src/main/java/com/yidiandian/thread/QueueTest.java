package com.yidiandian.thread;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author${罗显}
 * @date 2019/3/20
 * @time 10:59
 */
public class QueueTest {

    private static volatile Object objectA = new Object();
    private static volatile Object objectB = new Object();

    public static void main(String[] args) throws InterruptedException {

        //创建线程A
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //获取objectA 的共享资源监视锁
                    synchronized (objectA) {
                        System.out.println("threadA get lock for objectA");
                        //获取objectB 的共享资源监视锁
                        synchronized (objectB) {
                            System.out.println("objectA get lock for objectB");
                            //线程A 阻塞，并释放获取到的resourceA 的锁
                            System.out.println("threadA RESLEA threadA");
                            objectA.wait();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        //创建线程B
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
              try {
                  //休眠1s
                  Thread.sleep(1000);
                  //获取objectA 的共享资源监视锁
                  synchronized (objectA) {
                      System.out.println("threadA get lock for objectA");
                      //获取objectB 的共享资源监视锁
                      synchronized (objectB) {
                          System.out.println("objectA get lock for objectB");
                          //线程A 阻塞，并释放获取到的resourceA 的锁
                          System.out.println("threadA RESLEA threadA");
                          objectA.wait();
                      }
                  }
              }catch (Exception e){
                  e.printStackTrace();
              }
            }
        });
        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();

    }
}
