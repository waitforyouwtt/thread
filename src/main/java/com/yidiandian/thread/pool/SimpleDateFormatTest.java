package com.yidiandian.thread.pool;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author: 一点点
 * @Date: 2019/4/11 21:22
 * @Version 1.0
 */
public class SimpleDateFormatTest {

    static ThreadLocal<DateFormat> sdf = new ThreadLocal<DateFormat>(){
        @Override
        protected SimpleDateFormat initialValue(){
            return new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
        }
    };

    public static void main(String[] args) {

        /*         SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
        //创建多个线程，并启动
        for (int i =0;i<10;++i){
            Thread thread = new Thread( new Runnable() {
                @Override
                public void run() {
                    try {
                       synchronized (sdf){
                           System.out.println(sdf.parse( "2017-12-13 15:15:15" ));
                       }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            } );
            //启动线程
            thread.start();
        }*/

        //创建多个线程，并启动
        for (int i =0;i<10;++i){
            Thread thread = new Thread( new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(sdf.get().parse( "2017-12-13 15:15:15" ));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            } );
            //启动线程
            thread.start();
        }
    }
}
