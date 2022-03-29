/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.demo.eventBus;

import com.ad.demo.optimizeSync.RegObserver;
import com.google.common.eventbus.Subscribe;

/**
 * @author zhengyingdeng
 * @version $Id: RegNotificationObserver.java, v 0.1 2022-03-23 5:19 下午 zhengyingdeng Exp $$
 */
public class RegNotificationObserver {
    @Subscribe
    public void handleRegSuccess(Long userId) throws InterruptedException {
        System.out.println("RegNotificationObserver handleRegSuccess start: " + userId);
        Thread.sleep(4000);
        System.out.println("RegNotificationObserver handleRegSuccess end: " + userId);
    }
}