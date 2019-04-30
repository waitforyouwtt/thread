package com.yidiandian.designmodel.zerenlian;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 14:19
 * @Version 1.0
 */
public interface IWoman {
    // 发起请求
    String sendRequire();
    //获取当前状态：出嫁，未嫁，夫死
    int getType();
}
