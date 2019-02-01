package com.ad;

import com.ad.factory.DigitalEquipmentFactory;
import com.ad.factory.bean.Laptop;
import com.ad.factory.bean.Pad;
import com.ad.factory.bean.Phone;
import com.sun.xml.internal.ws.api.databinding.DatabindingFactory;

/**
 * 客户端
 *
 * @author:ABugKiller
 * @date:Created in 2019/1/31 19:26
 */
public class Client {
    public static void main(String[] args) throws Exception {

        String[] factoryClasses = {
                "com.ad.factory.AppleFactory",
                "com.ad.factory.SamsungFactory"
        };

        for (int i = 0; i < factoryClasses.length; i++) {
            System.out.println(factoryClasses[i]);
            Class<?> cls = Class.forName(factoryClasses[i]);
            DigitalEquipmentFactory factory = (DigitalEquipmentFactory) cls.newInstance();
            Laptop laptop = factory.manufactureLaptop();
            laptop.coding("ad");
            Pad pad = factory.manufacturePad();
            pad.playGame();
            Phone phone = factory.manufacturePhone();
            phone.setOwner("ad");
            phone.call();
        }
    }
}
