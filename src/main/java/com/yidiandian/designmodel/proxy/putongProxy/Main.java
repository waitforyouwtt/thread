package com.yidiandian.designmodel.proxy.putongProxy;

/**
 * @Author: 一点点
 * @Date: 2019/5/3 14:11
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        String name = "xy";
        GameProxy proxy = new GameProxy(name);
        proxy.login(name, "Ilovelzl");
        proxy.killBoss();
        proxy.upGrade();
        System.out.println("-----代理时间到--------");
    }
}
