package com.yidiandian.designmodel.template;

/**
 * @Author: 一点点
 * @Date: 2019/5/3 13:06
 * @Version 1.0
 */
public abstract class Model {
    //车辆启动
    protected abstract void start();
    //车辆停止
    protected abstract void stop();
    //车辆鸣笛
    protected abstract void alarm();
    //车辆发动机轰鸣
    protected abstract void engineBoom();

    protected void run(){
        this.engineBoom();
        this.start();
        if(isAlarm()){
            this.alarm();
        }
        this.stop();
    }

    protected boolean isAlarm(){
        return true;
    }
}
