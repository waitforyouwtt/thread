package com.yidiandian.designmodel.command;

/**
 * @Author: 一点点
 * @Date: 2019/5/3 14:46
 * @Version 1.0
 */
public abstract class Command {
    //抽象类的命令类，定义要执行的命令，具体命令主题由子类来完成
    public abstract void execute();
}
