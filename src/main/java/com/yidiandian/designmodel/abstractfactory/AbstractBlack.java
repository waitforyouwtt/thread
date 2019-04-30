package com.yidiandian.designmodel.abstractfactory;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 12:41
 * @Version 1.0
 */
public abstract class AbstractBlack implements Human {
    @Override
    public void getSkin() {
        System.out.println("我是黑人,拥有黑色的皮肤...");
    }
    @Override
    public void talk() {
        System.out.println("我是黑人,说的是非洲语...");
    }
}
