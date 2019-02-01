package com.ad.factory.bean;

/**
 * 三星平板
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 20:05
 */
public class SamsungPad implements Pad {
    @Override
    public void playGame() {
        System.out.println("用三星平板玩游戏");
    }
}
