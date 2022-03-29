/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.demo.optimizeAsync;

/**
 * @author zhengyingdeng
 * @version $Id: RegNotificationObserver.java, v 0.1 2022-03-23 5:19 下午 zhengyingdeng Exp $$
 */
public class RegNotificationObserver implements RegObserver {
    @Override
    public void handleRegSuccess(long userId) {
        System.out.println("RegNotificationObserver handleRegSuccess");
    }
}