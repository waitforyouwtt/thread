package com.yidiandian.designmodel.zerenlian;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 14:21
 * @Version 1.0
 */
public class Woman implements IWoman {
    /**
     * 1.未嫁，2.出嫁，3.夫死
     */
    private int type = 0;
    private String request;
    /**
     * 构造函数，设置女子信息
     * @param type
     * @param require
     */
    public Woman(int type,String require){
        this.type = type;
        this.request = require;
    }
    //获得请求内容
    @Override
    public String sendRequire() {
        return this.request;
    }
    /**
     * 获取当前状态
     * @return
     */
    @Override
    public int getType() {
        return this.type;
    }
}
