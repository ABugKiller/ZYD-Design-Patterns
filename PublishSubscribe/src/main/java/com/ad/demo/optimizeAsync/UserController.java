/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.demo.optimizeAsync;

import com.ad.demo.base.UserService;
import com.ad.demo.base.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author zhengyingdeng
 * @version $Id: TestController.java, v 0.1 2022-03-23 5:20 下午 zhengyingdeng Exp $$
 */
public class UserController {
    private UserService userService = new UserServiceImpl(); // 依赖注入
    private List<RegObserver> regObservers = new ArrayList<>();
    private Executor executor;

    // 一次性设置好，之后也不可能动态的修改
    public void setRegObservers(List observers) {
        regObservers.addAll(observers);
    }

    public Long register(String telephone, String password) {
        //省略输入参数的校验代码
        // 省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);

        for (RegObserver observer : regObservers) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    observer.handleRegSuccess(userId);
                }
            });
        }

        return userId;
    }
}