package com.yidiandian.designmodel.abstractfactory;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 12:41
 * @Version 1.0
 */
public abstract class AbstractWhite implements Human {
    @Override
    public void getSkin() {
        System.out.println("我是白种人,拥有白色的皮肤...");
    }
    @Override
    public void talk() {
        System.out.println("我是白种人,说的是英语...");
    }
}
