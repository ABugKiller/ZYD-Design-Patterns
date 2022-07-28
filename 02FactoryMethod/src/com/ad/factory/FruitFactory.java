package com.ad.factory;

import com.ad.factory.bean.Fruit;

/**
 * 水果工厂的抽象
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 18:39
 */
public interface FruitFactory {

    /**
     * 创建水果工厂
     *
     * @author:ABugKiller
     * @date:Created in 2019/1/31 18:40
     * @return:
     */
    public Fruit newInstance();
}
