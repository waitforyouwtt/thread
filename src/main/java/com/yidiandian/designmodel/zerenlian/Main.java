package com.yidiandian.designmodel.zerenlian;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 14:37
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        //创建一个女子，发送自己的类型与请求
        IWoman woman = new Woman(2,"我想出去购物..");
        //创建责任链
        ResponseHandler farther = new Father();
        ResponseHandler husband = new Husband();
        ResponseHandler son = new Son();
        //设置下一责任人。
        farther.setNext(husband);
        husband.setNext(son);

        //设置责任链入口，处理内容
        farther.handleMessage(woman);
    }
}
