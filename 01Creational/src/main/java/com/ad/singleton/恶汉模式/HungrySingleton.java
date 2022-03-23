/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.singleton.恶汉模式;

/**
 * 恶汉模式
 *
 * @author zhengyingdeng
 * @version $Id: Singleton.java, v 0.1 2022-01-11 7:25 下午 zhengyingdeng Exp $$
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();


    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}