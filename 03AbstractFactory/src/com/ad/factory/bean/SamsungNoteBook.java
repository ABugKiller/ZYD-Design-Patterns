package com.ad.factory.bean;

/**
 * 三星电脑
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 20:00
 */
public class SamsungNoteBook implements Laptop {
    @Override
    public void coding(String operator) {
        System.out.println("用三星电脑撸代码");
    }
}
