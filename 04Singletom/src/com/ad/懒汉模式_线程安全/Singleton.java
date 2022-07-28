package com.ad.懒汉模式_线程安全;

/**
 * 线程安全的写法
 *
 * @author:ABugKiller
 * @date:Created in 2019/2/1 14:09
 */
public class Singleton {
    private static volatile Singleton singleton = null;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }

        return singleton;
    }
}
