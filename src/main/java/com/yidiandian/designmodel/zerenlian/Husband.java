package com.yidiandian.designmodel.zerenlian;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 14:36
 * @Version 1.0
 */
public class Husband extends ResponseHandler{
    public Husband() {
        super(ResponseHandler.HUSBAND_LEVEL_RESPONSE);
    }
    @Override
    public void response(IWoman woman) {
        System.out.println("----------妻子向丈夫请求-------");
        System.out.println("------"+woman.sendRequire());
        System.out.println("我是丈夫，我限制你的自由....");
    }
}
