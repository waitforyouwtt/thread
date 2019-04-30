package com.yidiandian.designmodel.zhuangshi.demo;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 16:29
 * @Version 1.0
 */
public class ConcreteDecorator1 extends Decorator {
    //指向父类的方法
    public ConcreteDecorator1(Component component) {
        super( component );
    }
    private void decorator1(){
        System.out.println("---开始之前先修饰----");
    }
    @Override
    public void  doSomething(){
        System.out.println("-1111111111111111111");
        //修饰方法
        this.decorator1();
        //执行原始方法
        super.doSomething();
    }

}

