/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.demo.optimizeSync;

import java.util.ArrayList;
import java.util.List;

/**
 * 同步方式——优化版
 *
 * @author zhengyingdeng
 * @version $Id: TestController.java, v 0.1 2022-03-23 5:28 下午 zhengyingdeng Exp $$
 */
public class TestController {

    public static void main(String[] args) {
        // 同步方式
        UserController userController = new UserController();

        List<RegObserver> observerList = new ArrayList<>();
        observerList.add(new RegPromotionObserver());
        observerList.add(new RegNotificationObserver());
        userController.setRegObservers(observerList);

        userController.register("", "");
    }
}