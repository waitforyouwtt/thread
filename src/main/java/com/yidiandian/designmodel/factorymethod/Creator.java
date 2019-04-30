package com.yidiandian.designmodel.factorymethod;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 12:26
 * @Version 1.0
 */
public abstract class Creator {
    public abstract <T extends Product> T createProduce(Class<T> t);
}
