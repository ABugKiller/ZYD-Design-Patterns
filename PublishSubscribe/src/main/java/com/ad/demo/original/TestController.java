/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.demo.original;

/**
 * 同步方式
 *
 * @author zhengyingdeng
 * @version $Id: TestController.java, v 0.1 2022-03-23 4:31 下午 zhengyingdeng Exp $$
 */
public class TestController {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());

        subject.removeObserver(new ConcreteObserverOne());
        subject.removeObserver(new ConcreteObserverTwo());

        subject.notifyObservers(new Message());
    }
}