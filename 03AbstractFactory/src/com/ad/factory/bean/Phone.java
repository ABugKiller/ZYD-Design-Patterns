package com.ad.factory.bean;

/**
 * 手机
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 19:56
 */
public interface Phone {

    /**
     * 设置拥有者
     * @author:ABugKiller
     * @date:Created in 2019/1/31 21:14
     * @return:
     */
    public void setOwner(String owner);

    /**
     * 打电话
     * @author:ABugKiller
     * @date:Created in 2019/1/31 21:15
     * @return:
     */
    public void call();
}
