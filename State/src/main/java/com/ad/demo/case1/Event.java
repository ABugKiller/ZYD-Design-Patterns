/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.demo.case1;

/**
 * @author zhengyingdeng
 * @version $Id: Event.java, v 0.1 2022-05-27 4:29 下午 zhengyingdeng Exp $$
 */
public enum Event {

    /**
     * 吃蘑菇
     */
    GOT_MUSHROOM(0),

    /**
     * 获得斗篷
     */
    GOT_CAPE(1),

    /**
     * 获得火焰
     */
    GOT_FIRE(2),

    /**
     * 遇到怪物
     */
    MET_MONSTER(3);

    private int value;

    private Event(int value) { this.value = value; }

    public int getValue() { return this.value; }
}