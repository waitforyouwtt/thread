package com.yidiandian.designmodel.zhuangshi.example;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 16:56
 * @Version 1.0
 */
public class SortDecorator extends MyDecorator {
    public SortDecorator(SchoolScore schoolScore) {
        super( schoolScore );
    }
    private void getSort(){
        System.out.println("我在班里排名：第一[倒数]...");
    }
    @Override
    public void report(){
        //先报完成绩
        super.report();
        //再说明名次
        this.getSort();
    }
}
