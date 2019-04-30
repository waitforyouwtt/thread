package com.yidiandian.designmodel.prototype;

import java.util.Random;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 13:18
 * @Version 1.0
 */
public class MainMethod {
    public static void sendMail(Mail mail){
        System.out.println("标题："+mail.getSubject()+"  收件人："+mail.getReceiver()+"   内容：" + mail.getContext()+"发送成功");
    }
    //随机产生一些接收者和称谓信息。
    public static String getRandString(int length){
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i< 10;i++){
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
