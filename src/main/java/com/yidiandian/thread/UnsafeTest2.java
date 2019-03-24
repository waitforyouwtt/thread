package com.yidiandian.thread;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: 一点点
 * @Date: 2019/3/24 9:38
 * @Version 1.0
 */
public class UnsafeTest2 {

    static final Unsafe unsafe;
    static final long stateOffset;
    private volatile long state = 0;
    static{
        try{
            //使用反射机制获取Unsafe的成员便利狼theuNsafe
            Field field = Unsafe.class.getDeclaredField( "theUnsafe" );
            //设置为可存取
            field.setAccessible( true );
            //获取该变量的值
            unsafe = (Unsafe) field.get( null );
            //获取state 在UnsafeTest2 中的偏移量
            stateOffset = unsafe.objectFieldOffset( UnsafeTest2.class.getDeclaredField( "state" ) );
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
            throw new Error( e );
        }
    }

    public static void main(String[] args) {
        UnsafeTest2 unsafeTest = new UnsafeTest2();
        Boolean success = unsafe.compareAndSwapInt( unsafeTest,stateOffset,0,1 );
        System.out.println(success);
    }

    @sun.misc.Contended
    public final static class FieldLong{
        public volatile long value = 0L;
        @sun.misc.Contended
        int value2 =0;
        ReentrantLock reentrantLock = new ReentrantLock(  );
        ReentrantLock lock = new ReentrantLock( true );
    }
}
