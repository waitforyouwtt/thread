package com.yidiandian.designmodel.proxy.demo;

/**
 * @Author: 一点点
 * @Date: 2019/5/3 13:54
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        //实例化一个真实的被委托类。
        System.out.println("---------实例化一个真实的被委托类--------------");
        Proxy realSubject = new Proxy(new RealSubject());
        realSubject.request();
    }
}
