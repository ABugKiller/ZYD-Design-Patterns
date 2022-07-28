package com.ad.factory.bean;

/**
 * 苹果
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 18:47
 */
public class Apple extends Fruit {
    @Override
    public void process() {
        System.out.println("苹果加工完毕");
    }
}
