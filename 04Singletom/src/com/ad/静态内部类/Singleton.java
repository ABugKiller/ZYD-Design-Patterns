/**
 * www.mockuai.com
 * Copyright (c) 2021 All Rights Reserved.
 */
package com.ad.静态内部类;


/**
 * @author zhengyingdeng
 * @version $Id: Singleton.java, v 0.1 2021-10-11 11:21 下午 zhengyingdeng Exp $$
 */
public class Singleton {

    private static class Holder {
        private static Singleton singleton = new Singleton();
    }

    private Singleton() {

    }

    public static Singleton getInstance() {
        return Holder.singleton;
    }
}