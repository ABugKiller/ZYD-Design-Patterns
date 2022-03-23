/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.demo.case1;

/**
 * @author zhengyingdeng
 * @version $Id: ConcreteSubject.java, v 0.1 2022-03-23 4:29 下午 zhengyingdeng Exp $$
 */
public class ConcreteSubject implements Subject {

    @Override
    public void registerObserver(Observer observer) {
        observer.update(new Message());
        System.out.println("registerObserver");
    }

    @Override
    public void removeObserver(Observer observer) {
        observer.update(new Message());
        System.out.println("removeObserver");
    }

    @Override
    public void notifyObservers(Message message) {
        System.out.println("notifyObservers");
    }
}