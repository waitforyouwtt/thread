package com.yidiandian.designmodel.abstractfactory;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 12:41
 * @Version 1.0
 */
public abstract class AbstractYellow implements Human {
    @Override
    public void getSkin() {
        System.out.println("我是黄种人,拥有黄色的皮肤...");
    }
    @Override
    public void talk() {
        System.out.println("我是黄种人,说的是汉语...");
    }
}
