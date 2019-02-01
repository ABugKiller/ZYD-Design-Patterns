package com.ad.factory.bean;

/**
 * 香蕉
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 18:48
 */
public class Banana extends Fruit {
    @Override
    public void process() {
        System.out.println("香蕉加工完毕");
    }
}
