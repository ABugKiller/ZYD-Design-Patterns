//package com.ad;
//
//import com.ad.枚举.Resource;
//import com.ad.枚举.SomeThing;
//
///**
// * 客户端
// *
// * @author:ABugKiller
// * @date:Created in 2019/2/1 13:41
// */
//public class Client {
//
//    public static void main(String[] args) {
//        Resource instance1 = SomeThing.INSTANCE.getInstance();
//        Resource instance2 = SomeThing.INSTANCE.getInstance();
//        System.out.println(instance1.hashCode());
//        System.out.println(instance2.hashCode());
//        if (instance1.equals(instance2)) {
//            System.out.println("相等");
//        }else {
//            System.out.println("不相等");
//        }
//
//        Resource resource1 = new Resource();
//        Resource resource2 = new Resource();
//        System.out.println(resource1.hashCode());
//        System.out.println(resource2.hashCode());
//    }
//}
