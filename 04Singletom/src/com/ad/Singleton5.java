package com.ad;

import java.io.Serializable;

/**
 * 静态内部类的方法
 *
 * @author:ABugKiller
 * @date:Created in 2019/2/1 14:17
 */
public class Singleton5 implements Serializable {
    private static class Holder {
        private static Singleton5 singleton = new Singleton5();
    }

    private Singleton5() {

    }

    public static Singleton5 getSingleton() {
        return Holder.singleton;
    }

    public Object readResolve() {
        return Holder.singleton;
    }
}
