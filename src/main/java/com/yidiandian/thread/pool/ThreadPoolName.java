package com.yidiandian.thread.pool;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

/**
 * @Author: 一点点
 * @Date: 2019/4/11 21:36
 * @Version 1.0
 */
public class ThreadPoolName {

    static class NamedThreadFactory implements ThreadFactory{
        private static final AtomicInteger poolNumber = new AtomicInteger( 1 );
        private final ThreadGroup group;
        private final AtomicInteger threadNumber = new AtomicInteger( 1 );
        private final String namePrefix;

        NamedThreadFactory(String name){
            SecurityManager s = System.getSecurityManager();
            group = (s != null) ? s.getThreadGroup():Thread.currentThread().getThreadGroup();
            if (null == name || name.isEmpty()){
                name = "pool";
            }
            namePrefix = name +"-"+poolNumber.getAndIncrement()+"-thread-";
        }
        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(group,r,namePrefix+threadNumber.getAndIncrement(),0);
            if(t.isDaemon()){
                t.setDaemon( false );
            }
            if (t.getPriority() != Thread.NORM_PRIORITY){
                t.setPriority( Thread.NORM_PRIORITY );
            }
            return t;
        }
    }

    static ThreadPoolExecutor executorOne = new ThreadPoolExecutor( 5,5,1, TimeUnit.MINUTES,new LinkedBlockingQueue<>(  )
    ,new NamedThreadFactory( "ASYN-ACCEPT-POOL" ));
    static ThreadPoolExecutor executorTwo = new ThreadPoolExecutor( 5,5,1,TimeUnit.MINUTES,new LinkedBlockingQueue<>(  )
    ,new NamedThreadFactory( "ASYN-PROCESS-POOL" ));

    public static void main(String[] args) {
        //接受用户连接模块
          executorOne.execute( new Runnable() {
              @Override
              public void run() {
                  System.out.println("接受用户连接线程");
                  throw new NullPointerException(  );
              }
          } );
       //具体处理用户请求模块
       executorTwo.execute( new Runnable() {
           @Override
           public void run() {
               System.out.println("具体处理用户请求模块");
           }
       } );
       executorOne.shutdown();
       executorTwo.shutdown();
    }

}
