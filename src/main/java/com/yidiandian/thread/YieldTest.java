package com.yidiandian.thread;

/**
 * @Author: 一点点
 * @Date: 2019/3/21 21:20
 * @Version 1.0
 */
public class YieldTest implements Runnable{

    YieldTest(){
        //创建并启动线程
        Thread thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
      for (int i = 0 ;i< 5 ;i++){
          //当i=0 时，让出cpu 执行权，放弃时间片,进入下一轮调度
          if (i % 5 ==0){
              System.out.println("当前线程："+Thread.currentThread().getName()+"yield cpu");
              Thread.yield();
          }
      }
        System.out.println("当前线程："+Thread.currentThread().getName()+"game over");
    }

    public static void main(String[] args) throws InterruptedException {
        /*new YieldTest();
        new YieldTest();
        new YieldTest();*/

        Thread thread = new Thread( new Runnable() {
            @Override
            public void run() {
               //如果当前线程被中断则退出循环
                while(!Thread.currentThread().isInterrupted()){
                    System.out.println(Thread.currentThread()+"hello");
               }
            }
        });
        thread.start();
        //主线程休眠1秒，以便中断前让子线程输出
        Thread.sleep( 1000 );
        thread.interrupt();
        //等待子线程执行完毕
        thread.join();
    }


}
