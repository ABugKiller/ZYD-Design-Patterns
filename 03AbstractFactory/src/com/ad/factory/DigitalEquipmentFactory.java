package com.ad.factory;

import com.ad.factory.bean.Laptop;
import com.ad.factory.bean.Pad;
import com.ad.factory.bean.Phone;

/**
 * 数码设备工厂
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 19:54
 */
public interface DigitalEquipmentFactory {
    //生产笔记本电脑
    public Laptop manufactureLaptop();
    //生产手机
    public Phone manufacturePhone();
    //生产平板电脑
    public Pad manufacturePad();
}
