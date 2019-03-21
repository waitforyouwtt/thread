package com.yidiandian.thread;

/**
 * @author${罗显}
 * @date 2019/3/20
 * @time 14:01
 */
public class NotifyTest {

    private static volatile Object objectA = new Object();

    public static void main(String[] args) throws InterruptedException {
        //创建线程
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (objectA){
                    System.out.println("objectA get lock");
                    try {
                        System.out.println("objectA wait------BEGIN");
                        objectA.wait();
                        System.out.println("objectA wait------END");
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (objectA){
                    System.out.println("threadB get lock");
                    try {
                        System.out.println("threadB wait------begin");
                        objectA.wait();
                        System.out.println("threadB wait------end");
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });

        //创建线程
        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (objectA){
                    System.out.println("threadC begin notify");
                    objectA.notify();
                }
            }
        });

        //启动线程
        threadA.start();
        threadB.start();
        Thread.sleep(1000);
        threadC.start();

        //等待线程结束
        threadA.join();
        threadB.join();
        threadC.join();

    }
}
