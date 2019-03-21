package com.yidiandian.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author${罗显}
 * @date 2019/3/20
 * @time 14:40
 */
public class SleepTest {
    //创建一个独占锁
    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
      //创建线程A
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
              //获取独占锁
              lock.lock();
              System.out.println("child threadA is in sleep");
              try {
                  Thread.sleep(1000);
                  System.out.println("child threadA is in awaked-----");
              }catch (Exception e){
                  e.printStackTrace();
              }finally {
                  lock.unlock();
              }
            }
        });

        //创建线程B
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                //获取独占锁
                lock.lock();
                try {
                    System.out.println("child threadB is sleep");
                    Thread.sleep(1000);
                    System.out.println("child threadB is in awaked-----");
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    //释放锁
                    lock.unlock();
                }
            }
        });
        //启动线程
        threadA.start();
        threadB.start();
    }
}
