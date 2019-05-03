package com.yidiandian.designmodel.zerenlian;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 14:37
 * @Version 1.0
 */
public class Son extends ResponseHandler{
    public Son() {
        super(ResponseHandler.SON_LEVEL_RESPONSE);
    }
    @Override
    public void response(IWoman woman) {
        System.out.println("----------母亲向儿子请求-------");
        System.out.println("------"+woman.sendRequire());
        System.out.println("我是儿子，我一切都听你的....");
    }
}
