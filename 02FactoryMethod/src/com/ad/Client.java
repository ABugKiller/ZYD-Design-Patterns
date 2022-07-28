package com.ad;

import com.ad.factory.FruitFactory;
import com.ad.factory.bean.Fruit;

/**
 * 客户端
 *
 * @author:BugKiller
 * @date:Created in 2019/1/31 18:37
 */
public class Client {

    public static void main(String[] args) throws Exception {
        String[] factoryClasses = {
                "com.ad.factory.AppleFactory",
                "com.ad.factory.BananaFactoroy",
                "com.ad.factory.WatermelonFactory"
        };

        for (int i = 0; i < factoryClasses.length; i++) {
            Class<?> cls = Class.forName(factoryClasses[i]);
            FruitFactory fruitFactory = (FruitFactory) cls.newInstance();
            Fruit fruit = fruitFactory.newInstance();
            fruit.process();
        }
    }
}
