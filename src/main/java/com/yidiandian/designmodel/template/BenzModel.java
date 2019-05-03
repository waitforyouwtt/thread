package com.yidiandian.designmodel.template;

/**
 * @Author: 一点点
 * @Date: 2019/5/3 13:12
 * @Version 1.0
 */
public class BenzModel extends  Model {

    private boolean flag = true;

    public void setAlarm(boolean flag){
        this.flag = flag;
    }
    @Override
    protected boolean isAlarm(){
        return flag;
    }
    @Override
    protected void start() {
        System.out.println("奔驰启动...");
    }
    @Override
    protected void stop() {
        System.out.println("奔驰停止...");
    }
    @Override
    protected void alarm() {
        System.out.println("奔驰鸣笛...");
    }
    @Override
    protected void engineBoom() {
        System.out.println("奔驰发动机轰鸣...");
    }
}
