package com.ad.factory.bean;

/**
 * 香蕉
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/30 22:26
 */
public class Banana extends Fruit {

    @Override
    public void eatFruit(String name) {
        System.out.println(String.format("%s吃香蕉", name));
    }
}
