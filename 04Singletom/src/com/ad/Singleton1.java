package com.ad;

/**
 * 饿汉模式
 *
 * @author:ABugKiller
 * @date:Created in 2019/2/1 13:44
 */
public class Singleton1 {
    private static Singleton1 singleton = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getSingleton() {
        return singleton;
    }
}
