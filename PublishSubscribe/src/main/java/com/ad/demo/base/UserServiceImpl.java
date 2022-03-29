/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.demo.base;

/**
 * @author zhengyingdeng
 * @version $Id: UserServiceImpl.java, v 0.1 2022-03-23 5:24 下午 zhengyingdeng Exp $$
 */
public class UserServiceImpl implements UserService {
    @Override
    public long register(String telephone, String password) {
        System.out.println("UserServiceImpl register");
        return 0L;
    }
}