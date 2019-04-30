package com.yidiandian.designmodel.factorymethod;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 12:30
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Creator creator = new CreatorFactory();
        FoodProduct foodProduct = creator.createProduce( FoodProduct.class );
        foodProduct.method1();
        foodProduct.method2();
    }
}
