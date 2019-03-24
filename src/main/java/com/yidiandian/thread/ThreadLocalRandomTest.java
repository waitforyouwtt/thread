package com.yidiandian.thread;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author: 一点点
 * @Date: 2019/3/24 10:58
 * @Version 1.0
 */
public class ThreadLocalRandomTest {

    public static void main(String[] args) {
        //获取一个随机数生成器
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0;i< 10;++i){
            //包含0 不包含5
            System.out.println(random.nextInt(5));
        }
    }
}
