package com.yidiandian.designmodel.proxy.putongProxy;

/**
 * @Author: 一点点
 * @Date: 2019/5/3 14:04
 * @Version 1.0
 */
public class GameProxy implements IGamePlayer {

    private GamePlayer gamePlayer = null;
    public GameProxy(String name){
        try{
            this.gamePlayer = new GamePlayer(this,name);
        }catch (Exception e){
         e.printStackTrace();
        }
    }
    @Override
    public void login(String name, String pwd) {
        this.gamePlayer.login(name,pwd);
    }

    @Override
    public void killBoss() {
       this.gamePlayer.killBoss();
    }

    @Override
    public void upGrade() {
      this.gamePlayer.upGrade();
    }
}
