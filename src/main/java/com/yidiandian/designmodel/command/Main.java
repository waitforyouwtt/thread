package com.yidiandian.designmodel.command;

/**
 * @Author: 一点点
 * @Date: 2019/5/3 14:52
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        MyInvoker invoker = new MyInvoker();
        //声明命令的接收者
        Receiver receiver = new ConcreteReceive1();
        //声明命令
        Command command1 = new ConcreteCommand1( receiver );
        invoker.setCommand( command1 );
        invoker.action();
    }
}
