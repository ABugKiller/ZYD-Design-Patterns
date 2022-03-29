/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.demo.optimizeAsync;

import java.util.ArrayList;
import java.util.List;

/**
 * 异步方式
 *
 * @author zhengyingdeng
 * @version $Id: TestController.java, v 0.1 2022-03-23 5:28 下午 zhengyingdeng Exp $$
 */
public class TestController {

    /**
     * 异步实现方案：
     *      1、在每个handleRegSuccess()函数中创建一个新的线程执行代码逻辑（频繁创建、销毁线程，并发数无法控制，创建过多会堆栈溢出）
     *      2、在UserController的register()函数中使用线程池来执行每个观察者的在每个handleRegSuccess()函数（线程池和异步执行逻辑耦合在register()函数中，增加业务代码维护成本）
     *
     * @param args
     */
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