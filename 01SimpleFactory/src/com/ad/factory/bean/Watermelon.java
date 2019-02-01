package com.ad.factory.bean;

/**
 * 西瓜
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/30 22:25
 */
public class Watermelon extends Fruit {

    @Override
    public void eatFruit(String name) {
        System.out.println(String.format("%s吃西瓜", name));
    }
}
