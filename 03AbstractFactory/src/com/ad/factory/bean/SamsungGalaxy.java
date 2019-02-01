package com.ad.factory.bean;

/**
 * 三星手机
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 20:03
 */
public class SamsungGalaxy implements Phone {

    private String owner;

    @Override
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void call() {
        System.out.println(String.format("%s在用三星手机打电话！", this.owner));
    }
}
