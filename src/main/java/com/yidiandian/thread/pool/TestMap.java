package com.yidiandian.thread.pool;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: 一点点
 * @Date: 2019/4/11 19:58
 * @Version 1.0
 */
public class TestMap {
    //创建map,key为topic,value为设备列表
    static ConcurrentHashMap<String,List<String>> map = new ConcurrentHashMap<String, List<String>>(  );

    public static void main(String[] args) {
        //进入直播topic1,线程one
        Thread threadOne = new Thread( new Runnable() {
            @Override
            public void run() {
              List<String> list1 = new ArrayList<>( );
              list1.add( "de1" );
              list1.add( "de2" );

              map.put( "topic1",list1 );
                System.out.println(JSON.toJSONString(map));
            }
        } );
        //进入直播间topic1，线程two
        Thread threadTwo = new Thread( new Runnable() {
            @Override
            public void run() {
                List<String> list1 = new ArrayList<>( );
                list1.add( "de11" );
                list1.add( "de22" );
                map.put( "topic1",list1 );
                System.out.println(JSON.toJSONString(map));
            }
        } );
        //进入直播间topic2，线程three
        Thread threadThree = new Thread( new Runnable() {
            @Override
            public void run() {
                List<String> list1 = new ArrayList<>( );
                list1.add( "de111" );
                list1.add( "de222" );
                map.put( "topic2",list1 );
                System.out.println(JSON.toJSONString(map));
            }
        } );
        //启动线程
        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}
