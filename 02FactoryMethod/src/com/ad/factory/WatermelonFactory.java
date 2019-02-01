package com.ad.factory;

import com.ad.factory.bean.Fruit;
import com.ad.factory.bean.Watermelon;

/**
 * 西瓜工厂
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 18:42
 */
public class WatermelonFactory implements FruitFactory {

    @Override
    public Fruit newInstance() {
        return new Watermelon();
    }
}
