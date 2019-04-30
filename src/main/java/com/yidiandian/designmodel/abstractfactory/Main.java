package com.yidiandian.designmodel.abstractfactory;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 10:33
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("--------女性工厂-------------------");
        FemaleYellowHuman femaleYellow = (FemaleYellowHuman) new FemaleFactory().createYellowHuman();
        femaleYellow.getSex();
        femaleYellow.getSkin();
        femaleYellow.talk();
        System.out.println("--------男性工厂---------------");
        MaleYellowHuman maleYellow = (MaleYellowHuman) new MaleFactory().createYellowHuman();
        maleYellow.getSex();
        maleYellow.getSkin();
        maleYellow.talk();
    }
}
