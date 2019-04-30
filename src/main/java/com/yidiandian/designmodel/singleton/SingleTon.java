package com.yidiandian.designmodel.singleton;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 7:47
 * @Version 1.0
 */
public class SingleTon {
    /**
     * 懒汉式：线程不安全：如果多个线程进入if (instance == null)，并且执行{instance = new SingleTon();}
     * 将会导致实例化多次instance;
     */

     //私有静态变量被延迟实例化，好处：如果没有用到该类，那么就不会实例化instance,从而节约了资源
/*    private static SingleTon instance;
    private SingleTon(){}
    public static SingleTon getInstance(){
        if (instance == null){
            instance = new SingleTon();
        }
        return instance;
    }*/

    /**
     * 饿汉式：线程安全
     * 线程不安全主要是instance 被实例化多次，采取直接实例化就不会有安全问题，但也丢失了节约资源的好处
     */
/*    private static final SingleTon instance = new SingleTon();
    private SingleTon(){}
    public static SingleTon getInstance(){
        return instance;
    }*/

    /**
     * 双重检锁-线程安全
     * instance只需被实例化一次，之后就可以直接使用。加锁操作只需要对实例化那部分代码进行，只有当instance
     * 未实例化时，才需要加锁。如果只有一个最外层if判断，那么虽然有锁，但两个线程都会进行实例化，因此必须使用
     * 两个if 判断。
     */
/*    private volatile static SingleTon instance;
    private SingleTon(){}
    public static SingleTon getInstance(){
        if (instance == null){
            synchronized (SingleTon.class){
                if (instance == null){
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }*/

    /**
     * 静态内部类实现
     * 当SingleTon 类加载时，静态内部类没有被加载进内存，只有当调用公共构造方法时静态内部类才会被加载
     * 此时初始化instance 实例，并且jvm 能确保instance 只被实例化一次。不仅具有延迟初始化的好处，而且
     * JVM提供了对线程的安全支持。
     */
    private SingleTon(){}
    private static class SingleTonHolder{
        private static final SingleTon INSTANCE = new SingleTon();
    }
    public static SingleTon getInstance(){
        return SingleTonHolder.INSTANCE;
    }


}
