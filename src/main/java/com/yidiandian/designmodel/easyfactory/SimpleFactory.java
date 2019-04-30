package com.yidiandian.designmodel.easyfactory;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 9:46
 * @Version 1.0
 */
public class SimpleFactory {
    public Product createProduct(int type){
        if (type ==1){
            return new ConcreteProduct();
        }else if(type ==2){
            return new ConcreteProduct1();
        }else{
            return new ConcreteProduct2();
        }
    }
}
