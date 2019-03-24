package com.yidiandian.thread;

/**
 * @Author: 一点点
 * @Date: 2019/3/24 9:02
 * @Version 1.0
 */
public class ThreadNotSafeInteger {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
