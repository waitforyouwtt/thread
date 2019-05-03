package com.yidiandian.designmodel.command;

/**
 * @Author: 一点点
 * @Date: 2019/5/3 14:46
 * @Version 1.0
 */
public class ConcreteReceive2 extends Receiver {
    @Override
    public void doSomething() {
        System.out.println("接收者2号,需要执行的方法...");
    }
}
