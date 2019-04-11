package com.yidiandian.thread.pool;

import java.util.concurrent.*;

/**
 * @Author: 一点点
 * @Date: 2019/4/10 20:52
 * @Version 1.0
 */
public class ThreadPoolTest {

    //创建一个核心线程个数和最大线程个数都为num 的线程池，并且阻塞队列长度为最大，keeyAliveTime=0 说明只要线程个数比核心线程个数多并且当前空闲则回收
    public static ExecutorService newFixedThreadPool(int num){
        return new ThreadPoolExecutor( num,num,0L, TimeUnit.MICROSECONDS,new LinkedBlockingQueue<Runnable>() );
    }
    //使用自定义线程创建工厂
    public static ExecutorService newFixedThreadPool(int num, ThreadFactory threadFactory){
        return new ThreadPoolExecutor( num,num,0L,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>(  ),threadFactory );
    }

}
