package com.yidiandian.designmodel.easyfactory;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 9:48
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product= simpleFactory.createProduct( 1 );
        //todo
    }
}
