package com.yidiandian.thread;

/**
 * @Author: 一点点
 * @Date: 2019/3/24 9:03
 * @Version 1.0
 */
public class ThreadSfeInteger {

    private int value;

    private volatile int value2;

    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
}
