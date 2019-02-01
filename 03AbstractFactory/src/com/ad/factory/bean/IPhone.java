package com.ad.factory.bean;

/**
 * 苹果手机
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 20:01
 */
public class IPhone implements Phone {

    private String owner;

    @Override
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void call() {
        System.out.println(String.format("%s在用IPhone打电话！", this.owner));
    }
}
