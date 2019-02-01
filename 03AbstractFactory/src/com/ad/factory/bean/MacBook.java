package com.ad.factory.bean;

/**
 * 苹果电脑
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 20:00
 */
public class MacBook implements Laptop {
    @Override
    public void coding(String operator) {
        System.out.println("用Mac撸代码");
    }
}
