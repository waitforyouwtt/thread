package com.yidiandian.designmodel.proxy.putongProxy;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * @Author: 一点点
 * @Date: 2019/5/3 14:05
 * @Version 1.0
 */
public class GamePlayer implements IGamePlayer{

    private String name = "";
    public GamePlayer(IGamePlayer iGamePlayer, String name) throws Exception {
        if (iGamePlayer == null){
            throw new Exception( "不能创建角色" );
        }else{
            this.name= name;
        }
    }

    @Override
    public void upGrade() {
        System.out.println(this.name+"又升了一级...");
    }
    @Override
    public void killBoss() {
        System.out.println(this.name+"在打怪！");
    }
    @Override
    public void login(String name, String pwd) {
        System.out.println("用户："+this.name+"登陆成功");
    }
}
