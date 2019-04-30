package com.yidiandian.designmodel.abstractfactory;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 12:45
 * @Version 1.0
 */
public class FemaleYellowHuman extends AbstractYellow {
    @Override
    public void getSex() {
        System.out.println("我是中国女人...");
    }
}
