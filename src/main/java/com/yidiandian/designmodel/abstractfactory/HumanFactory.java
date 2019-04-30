package com.yidiandian.designmodel.abstractfactory;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 12:49
 * @Version 1.0
 */
public interface HumanFactory {
    //创建黑人
    Human createBlackHuman();
    //创建黄种人
    Human createYellowHuman();
    //创建白人
    Human createWhiteHuman();
}
