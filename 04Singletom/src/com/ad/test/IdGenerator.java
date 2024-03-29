/**
 * www.mockuai.com
 * Copyright (c) 2022 All Rights Reserved.
 */
package com.ad.test;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author zhengyingdeng
 * @version $Id: IdGenerator.java, v 0.1 2022-06-10 2:33 下午 zhengyingdeng Exp $$
 */
public class IdGenerator {

    // AtomicLong是一个Java并发库中提供的一个原子变量类型,
    // 它将一些线程不安全需要加锁的复合操作封装为了线程安全的原子操作，
    // 比如下面会用到的incrementAndGet().

    private AtomicLong id = new AtomicLong(0);
    private static final IdGenerator instance = new IdGenerator();

    private IdGenerator() {}

    public static IdGenerator getInstance() {

        return instance;
    }

    public long getId() {

        return id.incrementAndGet();
    }
}