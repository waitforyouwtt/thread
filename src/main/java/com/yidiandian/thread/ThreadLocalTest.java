package com.yidiandian.thread;

/**
 * @Author: 一点点
 * @Date: 2019/3/22 19:20
 * @Version 1.0
 */
public class ThreadLocalTest {

    static ThreadLocal<String> localVariable = new ThreadLocal<>();

    static void print(String str){
        System.out.println(str+":"+localVariable.get());
        //清除当前线程本地内存中的localVariable变量
        //localVariable.remove();
    }

    public static void main(String[] args) {
        //创建线程one
        Thread thread = new Thread( new Runnable() {
            @Override
            public void run() {
              localVariable.set( "threadOne local variable" );
              //调用打印函数
                print( "threadOne" );
                // 打印本地变量值
                System.out.println("threadOne remove after"+":"+localVariable.get());
            }
        } );
        Thread threadTwo = new Thread( new Runnable() {
            @Override
            public void run() {
              //设置线程Two中本地变量localVariable 的值
                localVariable.set( "threadTwo local variable" );
                //调用打印函数
                print( "threadTwo" );
                // 打印本地变量值
                System.out.println("threadTwo remove after"+":"+localVariable.get());
            }
        } );

        // 启动线程
        thread.start();
        threadTwo.start();

    }

}
