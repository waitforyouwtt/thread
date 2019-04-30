package com.yidiandian.designmodel.zhuangshi.demo;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 16:39
 * @Version 1.0
 */
public class ConcreteDecorator2 extends Decorator{
    //指向父类的方法
    public ConcreteDecorator2(Component component) {
        super( component );
    }
    private void decorator2(){
        System.out.println("----结束之后再修饰----");
    }
    @Override
    public void doSomething(){
        System.out.println("-222222222222222222222");
        //执行原始方法
        super.doSomething();
        //修饰方法
        this.decorator2();
    }
}
