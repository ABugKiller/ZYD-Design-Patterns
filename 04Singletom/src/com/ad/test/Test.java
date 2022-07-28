/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.test;

/**
 * @author zhengyingdeng
 * @version $Id: Test.java, v 0.1 2022-06-10 2:32 下午 zhengyingdeng Exp $$
 */
public class Test {

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {

                }
            }).start();
        }
    }

}