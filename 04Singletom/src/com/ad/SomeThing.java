package com.ad;


/**
 * 枚举写法
 *
 * @author:ABugKiller
 * @date:Created in 2019/2/1 14:17
 */

class Resource {

}

//枚举中我们明确了构造方法限制为私有，在我们访问枚举实例时会执行构造方法，
// 同时每个枚举实例都是static final类型的，也就表明只能被实例化一次
public enum SomeThing {
    INSTANCE;
    private Resource instance;

    SomeThing() {
        instance = new Resource();
    }

    public Resource getInstance() {
        return instance;
    }
}
