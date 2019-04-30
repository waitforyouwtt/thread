package com.yidiandian.designmodel.abstractfactory;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 12:50
 * @Version 1.0
 */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
}
