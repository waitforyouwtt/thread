package com.yidiandian.thread;

/**
 * @author${罗显}
 * @date 2019/3/20
 * @time 11:30
 */
public class WaitNotfifyInterupt {
   static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
              try {
                  System.out.println("begin");
                  synchronized (obj){
                      obj.wait(3000,2);
                  }
                  System.out.println("end");
              }catch (Exception e){
                  e.printStackTrace();
              }
            }
        });
        threadA.start();
        Thread.sleep(1000);
        System.out.println("begin ---------------");
        threadA.interrupt();
        System.out.println("end -----------------");
        //异常返回并终止

    }



}
