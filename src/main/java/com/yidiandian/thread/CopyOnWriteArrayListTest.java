package com.yidiandian.thread;

import org.apache.tomcat.jni.Lock;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: 一点点
 * @Date: 2019/3/24 18:52
 * @Version 1.0
 */
public class CopyOnWriteArrayListTest {

    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList <String> arrayList = new CopyOnWriteArrayList<>(  );
        arrayList.add( "hello" );
        arrayList.add( "alibaba" );

      /*  Iterator<String> itr =  arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/

      Thread threadOne = new Thread( new Runnable() {
          @Override
          public void run() {
            arrayList.set( 0,"ali" );
            arrayList.set( 1,"baba" );
            arrayList.set( 2,"hello" );
            arrayList.set( 3,"jack" );
            arrayList.set( 4,"world" );
            arrayList.remove( 2 );
            arrayList.remove( 3 );
          }
      } );
        Iterator<String> itr =  arrayList.iterator();
        threadOne.start();
        //等待子线程执行完毕
        threadOne.join();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }


}
