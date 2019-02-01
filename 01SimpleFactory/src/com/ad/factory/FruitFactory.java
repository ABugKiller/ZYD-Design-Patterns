package com.ad.factory;

import com.ad.factory.bean.Apple;
import com.ad.factory.bean.Banana;
import com.ad.factory.bean.Fruit;
import com.ad.factory.bean.Watermelon;

/**
 * 水果的工厂
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/30 22:27
 */
public class FruitFactory {
    public static Fruit getFruit(FruitType type) {
        switch (type) {
            case APPLE:
                return new Apple();
            case BANANA:
                return new Banana();
            case WATERMELON:
                return new Watermelon();
            default:
                throw new IllegalArgumentException("未知水果类型");
        }
    }
}
