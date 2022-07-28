/**
 * www.mockuai.com
 * Copyright (c) 2021 All Rights Reserved.
 */
package com.ad.懒汉模式_线程安全_高效;

/**
 * 线程安全和效率的写法
 *
 * @author zhengyingdeng
 * @version $Id: Singleton.java, v 0.1 2021-10-11 11:18 下午 zhengyingdeng Exp $$
 */
public class Singleton {

    private static volatile Singleton singleton = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
}