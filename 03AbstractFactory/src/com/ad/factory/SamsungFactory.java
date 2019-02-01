package com.ad.factory;

import com.ad.factory.bean.*;

/**
 * 三星工厂
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 20:10
 */
public class SamsungFactory implements DigitalEquipmentFactory {
    @Override
    public Laptop manufactureLaptop() {
        return new SamsungNoteBook();
    }

    @Override
    public Phone manufacturePhone() {
        return new SamsungGalaxy();
    }

    @Override
    public Pad manufacturePad() {
        return new SamsungPad();
    }
}
