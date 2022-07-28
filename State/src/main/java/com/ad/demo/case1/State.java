/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.demo.case1;

/**
 * @author zhengyingdeng
 * @version $Id: State.java, v 0.1 2022-05-27 4:32 下午 zhengyingdeng Exp $$
 */
public enum State {

    /**
     * 小
     */
    SMALL(0),

    /**
     * 超级
     */
    SUPER(1),

    /**
     * 火焰
     */
    FIRE(2),

    /**
     * 斗篷
     */
    CAPE(3);

    private int value;

    private State(int value) { this.value = value; }

    public int getValue() { return this.value; }
}