package com.ad.factory;

import com.ad.factory.bean.Apple;
import com.ad.factory.bean.Fruit;

/**
 * 苹果工厂
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 18:41
 */
public class AppleFactory implements FruitFactory {

    @Override
    public Fruit newInstance() {
        return new Apple();
    }
}
