package com.yidiandian.designmodel.zhuangshi.demo;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 16:24
 * @Version 1.0
 */
public class ConcreteComponent extends Component {
    @Override
    public void doSomething() {
        System.out.println("我是抽象构件的具体实现......");
    }
}
