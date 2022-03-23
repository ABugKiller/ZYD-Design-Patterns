/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.demo.case1;

/**
 * @author zhengyingdeng
 * @version $Id: ConcreteObserverTwo.java, v 0.1 2022-03-23 4:30 下午 zhengyingdeng Exp $$
 */
public class ConcreteObserverTwo implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("ConcreteObserverTwo");
    }
}