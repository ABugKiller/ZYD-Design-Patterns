/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.demo.optimizeSync;

/**
 * @author zhengyingdeng
 * @version $Id: RegPromotionObserver.java, v 0.1 2022-03-23 5:19 下午 zhengyingdeng Exp $$
 */
public class RegPromotionObserver implements RegObserver {
    @Override
    public void handleRegSuccess(long userId) {
        System.out.println("RegPromotionObserver handleRegSuccess");
    }
}