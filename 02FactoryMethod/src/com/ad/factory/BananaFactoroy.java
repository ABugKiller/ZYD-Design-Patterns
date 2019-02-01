package com.ad.factory;

import com.ad.factory.bean.Banana;
import com.ad.factory.bean.Fruit;

/**
 * 香蕉工厂
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 18:41
 */
public class BananaFactoroy implements FruitFactory {

    @Override
    public Fruit newInstance() {
        return new Banana();
    }
}
