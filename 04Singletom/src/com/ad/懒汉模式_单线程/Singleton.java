package com.ad.懒汉模式_单线程;

/**
 * 单线程写法
 *
 * @author:ABugKiller
 * @date:Created in 2019/2/1 14:08
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {

    }

    /**
     * 单线程写法
     *
     * @return
     */
    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
