package com.ad.factory.bean;

/**
 * 苹果
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/30 22:24
 */
public class Apple extends Fruit {

    @Override
    public void eatFruit(String name) {
        System.out.println(String.format("%s吃苹果", name));
    }
}
