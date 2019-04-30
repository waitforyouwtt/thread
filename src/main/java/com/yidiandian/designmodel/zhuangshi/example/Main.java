package com.yidiandian.designmodel.zhuangshi.example;

import com.yidiandian.designmodel.zhuangshi.demo.ConcreteComponent;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 16:42
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        //拿着自己的原始成绩单
        SchoolScore sc = new ConcreteStudent();
        //加上一层修饰，最高分的修饰
        sc = new HighScoreDecorator( sc );
        //再加上第二次修饰，我的排名修饰
        sc = new SortDecorator( sc );
        //做出报告说明
        sc.report();
        //签字
        sc.sign( "yy" );
    }
}
