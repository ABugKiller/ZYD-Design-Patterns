/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.singleton;

import com.ad.singleton.恶汉模式.HungrySingleton;
import org.junit.jupiter.api.Test;

/**
 * @author zhengyingdeng
 * @version $Id: SingletonTest.java, v 0.1 2022-01-11 7:27 下午 zhengyingdeng Exp $$
 */
public class SingletonTest {

    @Test
    public void testHungrySingleton() {
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        if (instance1.equals(instance2)) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
    }


}