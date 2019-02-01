package com.ad.factory;

import com.ad.factory.bean.*;

/**
 * 苹果工厂
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 20:09
 */
public class AppleFactory implements DigitalEquipmentFactory {
    @Override
    public Laptop manufactureLaptop() {
        return new MacBook();
    }

    @Override
    public Phone manufacturePhone() {
        return new IPhone();
    }

    @Override
    public Pad manufacturePad() {
        return new IPad();
    }
}
