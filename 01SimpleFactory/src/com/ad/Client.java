package com.ad;

import com.ad.factory.FruitFactory;
import com.ad.factory.FruitType;
import com.ad.factory.bean.Fruit;

/**
 * 客户端调用
 *
 * @author:BugKiller
 * @date:Created in 2019/1/30 22:07
 */
public class Client {

    public static void main(String[] args) {
        //ad吃苹果
        Fruit fruit = FruitFactory.getFruit(FruitType.APPLE);
        fruit.eatFruit("ad");
        //ad吃香蕉
        fruit = FruitFactory.getFruit(FruitType.BANANA);
        fruit.eatFruit("ad");
        //ad吃西瓜
        fruit = FruitFactory.getFruit(FruitType.WATERMELON);
        fruit.eatFruit("ad");
    }
}
