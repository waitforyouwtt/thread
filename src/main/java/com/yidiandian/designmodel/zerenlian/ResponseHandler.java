package com.yidiandian.designmodel.zerenlian;

/**
 * @Author: 一点点
 * @Date: 2019/4/30 14:25
 * @Version 1.0
 */
public abstract class ResponseHandler {
   //父亲处理等级
    public static final int FATHER_LEVEL_RESPONSE = 1;
    //丈夫处理等级
    public static final int HUSBAND_LEVEL_RESPONSE = 2;
    //儿子处理等级
    public static final int SON_LEVEL_RESPONSE = 3;
    //当前等级
    private int level = 0;
    //设置下一个责任人是谁
    private ResponseHandler nextHandler;
    public ResponseHandler(int level){
        this.level = level;
    }
    public void setNext(ResponseHandler handler){
        this.nextHandler = handler;
    }
    public void handleMessage(IWoman woman){
        System.out.println("当前等级："+this.level+"  类型："+woman.getType());
        if (this.level == woman.getType()){
            //如果女子的当前等级与定义等级相同，那么即做出回应
            this.response(woman);
        }else{
            //不满足当前等级，寻找下一个责任人
            if (nextHandler != null){
                this.nextHandler.response(woman);
            }else{
                //没有后继责任人，就停止回调
                System.out.println("无责任人，自由");
            }
        }
    }
    protected abstract void response(IWoman woman);
}
