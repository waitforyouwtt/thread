package com.yidiandian.designmodel.abstractfactory;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 12:50
 * @Version 1.0
 */
public class MaleFactory implements HumanFactory {
    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
}
