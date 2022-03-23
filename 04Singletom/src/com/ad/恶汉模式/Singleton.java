package com.ad.恶汉模式;

/**
 * 饿汉模式
 *
 * @author:ABugKiller
 * @date:Created in 2019/2/1 13:44
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
