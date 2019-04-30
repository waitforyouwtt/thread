package com.yidiandian.designmodel.zhuangshi.example;

import com.yidiandian.designmodel.zhuangshi.example.SchoolScore;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 16:46
 * @Version 1.0
 */
public class ConcreteStudent extends SchoolScore {
    @Override
    public void report() {
        System.out.println("语:"+80+"数:"+70+"外:"+60+"政:"+87+"史:"+76+"地:"+65+"理:"+55+"化:"+44+"生:"+33);
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签字："+name);
    }
}
