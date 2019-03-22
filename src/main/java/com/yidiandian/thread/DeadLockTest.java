package com.yidiandian.thread;

/**
 * @Author: 一点点
 * @Date: 2019/3/22 10:33
 * @Version 1.0
 */
public class DeadLockTest {
    //创建资源
    private static Object resourceA = new Object();
    private static Object resourceB = new Object();

    public static void main(String[] args) {
        Thread threadA = new Thread( new Runnable() {
            @Override
            public void run() {
               synchronized (resourceA){
                   try{
                       Thread.sleep( 1000 );
                   }catch (Exception e){
                       e.printStackTrace();
                   }
                   System.out.println(Thread.currentThread()+"waiting get sourceB");
                   synchronized (resourceB){
                       System.out.println(Thread.currentThread()+"get resourceB");
                   }
               }
            }
        } );

        Thread threadB = new Thread( new Runnable() {
            @Override
            public void run() {
                // 如果要避免死锁，则换成 resourceA，下面变作B
                synchronized (resourceB){
                    System.out.println(Thread.currentThread()+"get resourceB");
                    try{
                        Thread.sleep( 1000 );
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread()+"waiting get sourceA");
                    synchronized (resourceA){
                        System.out.println(Thread.currentThread()+"get resourceA");
                    }
                }
            }
        } );
        //启动线程
        threadA.start();
        threadB.start();
    }
}
