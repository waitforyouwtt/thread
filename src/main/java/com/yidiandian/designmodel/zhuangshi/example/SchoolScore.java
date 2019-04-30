package com.yidiandian.designmodel.zhuangshi.example;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 16:44
 * @Version 1.0
 */
public abstract class SchoolScore {
    //定义一个成绩单的接口，共每个学生去实现
    //每个学生报告给家长，自己的成绩
    public abstract void report();
    //要求家长签字
    public abstract void sign(String name);
}
