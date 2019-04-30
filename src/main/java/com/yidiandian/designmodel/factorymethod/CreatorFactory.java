package com.yidiandian.designmodel.factorymethod;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 12:28
 * @Version 1.0
 */
public class CreatorFactory extends Creator {
    @Override
    public <T extends Product> T createProduce(Class<T> t) {
        Product product = null;
        try{
         product = (Product) Class.forName( t.getName() ).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T) product;
    }
}
