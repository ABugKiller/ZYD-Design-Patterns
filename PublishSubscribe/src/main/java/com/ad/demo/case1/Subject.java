/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.demo.case1;

/**
 * @author zhengyingdeng
 * @version $Id: Subject.java, v 0.1 2022-03-23 4:27 下午 zhengyingdeng Exp $$
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Message message);
}