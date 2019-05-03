package com.yidiandian.designmodel.command;

/**
 * @Author: 一点点
 * @Date: 2019/5/3 14:48
 * @Version 1.0
 */
public class ConcreteCommand1 extends Command {
    private Receiver receiver;
    public ConcreteCommand1(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
      //让接收者去执行具体的方法
      this.receiver.doSomething();
    }
}
