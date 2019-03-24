package com.yidiandian.thread;

import sun.misc.Unsafe;

/**
 * @Author: 一点点
 * @Date: 2019/3/24 9:29
 * @Version 1.0
 */
public class UnsafeTest {

    //获取Unsafe 的实例
    static final Unsafe unsafe = Unsafe.getUnsafe();

    //记录state 在类UnsafeTest 中的偏移量
    static final long stateOffset;
    //变量
    private final long state = 0;

    static{
        try{
            stateOffset = unsafe.objectFieldOffset( UnsafeTest.class.getDeclaredField( "state" ));
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
            throw new Error(e);
        }
    }

    public static void main(String[] args) {
        UnsafeTest unsafeTest = new UnsafeTest();
        boolean success = unsafe.compareAndSwapInt( unsafeTest,stateOffset,0,1 );
        System.out.println(success);
    }
}
