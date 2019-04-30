package com.yidiandian.designmodel.factorymethod;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 9:43
 * @Version 1.0
 */
public abstract class Product {
    public void method1(){
        System.out.println("方法一，加工的都是使用的产品...");
    }
    public abstract void method2();
}
