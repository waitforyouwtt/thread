package com.yidiandian.designmodel.command;

/**
 * @Author: 一点点
 * @Date: 2019/5/3 14:51
 * @Version 1.0
 */
public class MyInvoker {
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void action(){
        this.command.execute();
    }
}
