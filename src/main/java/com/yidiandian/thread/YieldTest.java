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
          //当i=0 时，让出cpu 执行权，放弃时间片
          if (i % 5 ==0){
              System.out.println("当前线程："+Thread.currentThread().getName()+"yield cpu");
          }
      }
        System.out.println("当前线程："+Thread.currentThread().getName()+"game over");
    }

    public static void main(String[] args) {
        new YieldTest();
        new YieldTest();
        new YieldTest();
    }
}
