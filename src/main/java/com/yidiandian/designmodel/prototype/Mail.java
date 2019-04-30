package com.yidiandian.designmodel.prototype;

import lombok.Data;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 13:14
 * @Version 1.0
 */
@Data
public class Mail implements Cloneable {
    //收件人
    private String receiver;
    //名称
    private String subject;
    //称谓
    private String appellation;
    //内容
    private String context;
    //版本信息
    private String tail;

    public Mail(AdvTemplate advTemplate){
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvContent();
    }
    //重写object 类中的clone 方法
    @Override
    protected Object clone(){
        Mail mail = null;
        try{
            mail = (Mail) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return mail;
    }
}
