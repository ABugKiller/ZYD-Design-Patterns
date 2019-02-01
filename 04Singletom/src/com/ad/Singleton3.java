package com.ad;

/**
 * 线程安全的写法
 *
 * @author:ABugKiller
 * @date:Created in 2019/2/1 14:09
 */
public class Singleton3 {
    private static volatile Singleton3 singleton = null;

    private Singleton3() {

    }

    public static Singleton3 getSingleton() {
        synchronized (Singleton3.class) {
            if (singleton == null) {
                singleton = new Singleton3();
            }
        }
        return singleton;
    }
}
