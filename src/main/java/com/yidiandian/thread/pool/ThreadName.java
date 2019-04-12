package com.yidiandian.thread.pool;

/**
 * @Author: 一点点
 * @Date: 2019/4/11 21:24
 * @Version 1.0
 */
public class ThreadName {

    static final String THREAD_SAVE_ORDER = "HREAD_SAVE_ORDER";
    static final String THREAD_SAVE_ADDR = "THREAD_SAVE_ADDR";
    public static void main(String[] args) {
        //订单模块
        Thread threadOne = new Thread( new Runnable() {
            @Override
            public void run() {
                System.out.println("保存订单的线程");
                try{
                    Thread.sleep( 500 );
                }catch (Exception e){
                    e.printStackTrace();
                }
                throw new NullPointerException(  );
            }
        },THREAD_SAVE_ORDER);
        //发货模块
        Thread threadTwo = new Thread( new Runnable() {
            @Override
            public void run() {
                System.out.println("保存收获地址的线程");
            }
        },THREAD_SAVE_ADDR );
        //启动xianc
        threadOne.start();
        threadTwo.start();
    }
}
