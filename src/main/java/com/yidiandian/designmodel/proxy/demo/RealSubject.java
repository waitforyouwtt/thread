package com.yidiandian.designmodel.proxy.demo;

/**
 * @Author: 一点点
 * @Date: 2019/5/3 13:51
 * @Version 1.0
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("我是RealSubject,我在执行方法....");
    }
}
