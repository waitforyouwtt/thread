package com.yidiandian.designmodel.abstractfactory;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 12:46
 * @Version 1.0
 */
public class MaleWhiteHuman extends AbstractBlack {
    @Override
    public void getSex() {
        System.out.println("我是美国男人...");
    }
}
