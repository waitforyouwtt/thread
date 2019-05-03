package com.yidiandian.designmodel.template;

import java.util.Scanner;

/**
 * @Author: 一点点
 * @Date: 2019/5/3 13:13
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
       /* System.out.println("奔驰车模板---------");
        Model bz = new BenzModel();
        bz.run();
        System.out.println("宝马车模板----------");
        Model bm = new BMWModel();
        bm.run();*/

        System.out.println("------奔驰车模板----------");
        System.out.println("用户设置车辆是否鸣笛，1表示可以鸣笛，2表示不可以鸣笛.");
        BenzModel benz = new BenzModel();
        Scanner input = new Scanner(System.in);
        String type = input.next();
        if(type.equals("1")){
            benz.setAlarm(true);
        }else if(type.equals("2")){
            benz.setAlarm(false);
        }else{
            System.out.println("无效的输入！");
            return;
        }
        benz.run();
    }
}
