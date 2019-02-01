package com.ad;

/**
 * 线程安全和效率的写法
 *
 * @author:ABugKiller
 * @date:Created in 2019/2/1 14:12
 */
public class Singleton4 {
    private static volatile Singleton4 singleton = null;

    private Singleton4() {

    }

    public static Singleton4 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}
