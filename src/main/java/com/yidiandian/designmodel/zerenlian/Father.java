package com.yidiandian.designmodel.zerenlian;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 14:34
 * @Version 1.0
 */
public class Father extends ResponseHandler {
    public Father() {
        super( ResponseHandler.FATHER_LEVEL_RESPONSE );
    }

    @Override
    protected void response(IWoman woman) {
        System.out.println("---女儿向父亲发起请求---");
        System.out.println("------"+woman.sendRequire());
        System.out.println("我是父亲，我统一你的请求...");
    }
}
