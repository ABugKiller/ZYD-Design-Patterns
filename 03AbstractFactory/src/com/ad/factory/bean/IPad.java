package com.ad.factory.bean;

/**
 * 苹果手表
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 20:04
 */
public class IPad implements Pad {
    @Override
    public void playGame() {
        System.out.println("用IPad玩游戏");
    }
}
