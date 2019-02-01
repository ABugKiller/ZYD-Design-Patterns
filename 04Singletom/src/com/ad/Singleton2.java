package com.ad;

/**
 * 单线程写法
 *
 * @author:ABugKiller
 * @date:Created in 2019/2/1 14:08
 */
public class Singleton2 {
    private static Singleton2 singleton = null;

    private Singleton2() {

    }

    public static Singleton2 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
