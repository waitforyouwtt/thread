package com.yidiandian.designmodel.zhuangshi.example;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 16:50
 * @Version 1.0
 */
public class MyDecorator extends SchoolScore{

    //定义学生成绩
    private SchoolScore schoolScore;
    //用构造函数，实例化学生成绩类
    public MyDecorator(SchoolScore schoolScore){
        this.schoolScore = schoolScore;
    }
    @Override
    public void report() {
        this.schoolScore.report();
    }
    @Override
    public void sign(String name) {
      this.schoolScore.sign( name );
    }
}
