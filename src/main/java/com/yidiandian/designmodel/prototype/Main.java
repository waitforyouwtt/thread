package com.yidiandian.designmodel.prototype;

import javax.activation.MailcapCommandMap;
import java.util.Random;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 13:20
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        //将模板放入到mail 实例中，发送邮件
        Mail mail = new Mail( new AdvTemplate() );
        int i = 0;
        while (i < 10){
           // Mail cloneMail = (Mail) mail.clone();
            mail.setAppellation(MainMethod.getRandString( 5 )+"先生：您好!\n" );
            mail.setReceiver( MainMethod.getRandString( 5 )+"@"+MainMethod.getRandString( 8 )+".com\n" );
            MainMethod.sendMail(mail);
            i++;
        }
    }


}
