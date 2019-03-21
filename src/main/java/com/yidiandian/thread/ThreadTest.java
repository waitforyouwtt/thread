package com.yidiandian.thread;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author${罗显}
 * @date 2019/3/20
 * @time 9:53
 */
public class ThreadTest {
    /**
     * 继承thread 类
     */
    public static class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println("this method for Thread run ");
        }
    }

    /**
     * 实现Runnable 接口
     */
    public static class RunnableTask implements Runnable{
        @Override
        public void run() {
            System.out.println("this method for RunnableTask run");
        }
    }

    /**
     * 实现Callable 接口
     */
    public static class CallTask implements Callable<String> {
        @Override
        public String call() throws Exception {
            return "call";
        }
    }

    public static void main(String [] args) throws Exception {
        //方法一：创建线程  //启动线程
        /*MyThread myThread = new MyThread();
        myThread.start();*/
        //方法二：实现Runnable 接口
        RunnableTask task = new RunnableTask();
        new Thread(task).start();
        new Thread(task).start();
        //方法三： 实现Callable 接口
        FutureTask<String> futureTask = new FutureTask<>(new CallTask());
        //启动线程
        new Thread(futureTask).start();
        try {
            //等待线程结束，返回的结果
            String result =futureTask.get();
            System.out.println("得到的结果："+result);
        }catch (Exception e){
            e.printStackTrace();
        }



    }



}
