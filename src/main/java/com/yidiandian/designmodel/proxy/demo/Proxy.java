package com.yidiandian.designmodel.proxy.demo;

/**
 * @Author: 一点点
 * @Date: 2019/5/3 13:51
 * @Version 1.0
 */
public class Proxy implements Subject {
    //代理类，负责真实角色的应用。
    private Subject subject = null;

    public Proxy(Subject subject){
        this.subject = subject;
    }
    @Override
    public void request() {
        before();
        this.subject.request();
        after();
    }
    private void before() {
        System.out.println("代理类，在做事前处理...");
    }
    private void after() {
        System.out.println("代理类，在做事后处理...");
    }
}
