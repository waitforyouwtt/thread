package com.yidiandian.designmodel.zhuangshi.demo;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 16:25
 * @Version 1.0
 */
public abstract class Decorator extends Component {

    //有一个私有方法，指向component类
    private Component component;
    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void doSomething() {
        //让component 的实现类去执行方法
       this.component.doSomething();
    }
}
