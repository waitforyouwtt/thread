package com.yidiandian.designmodel.zhuangshi.example;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 16:55
 * @Version 1.0
 */
public class HighScoreDecorator extends MyDecorator {
    public HighScoreDecorator(SchoolScore schoolScore) {
        super( schoolScore );
    }
    private void highScoreSchool() {
        //System.out.println("语文最高分：99,数学最高分：88，英语最高分：77");
        System.out.println("语:"+100+"数:"+99+"外:"+88+"政:"+88+"史:"+99+"地:"+100+"理:"+66+"化:"+88+"生:"+99);
    }
    @Override
    public void report(){
        this.highScoreSchool();
        //再报自己的成绩
        super.report();
    }
}

