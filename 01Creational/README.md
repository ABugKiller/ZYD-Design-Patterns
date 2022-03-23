# ZYD-Design-Patterns
* [为什么要使用单例？](#为什么要使用单例？)
    * [封装](#封装)
* [单例存在哪些问题？](#单例存在哪些问题？)
    * [泛化关系 (Generalization)](#泛化关系-generalization)
* [单例与静态类的区别？](#单例与静态类的区别？)
    * [S.O.L.I.D](#solid)
* [有何替代的解决方案？](#有何替代的解决方案？)
    * [S.O.L.I.D](#solid)


为什么要使用单例？

如何实现一个单例？
    需要关注的点无外乎下面几个：
        构造函数需要是 private 访问权限的，这样才能避免外部通过 new 创建实例；
        考虑对象创建时的线程安全问题；
        考虑是否支持延迟加载；
        考虑 getInstance() 性能是否高（是否加锁）。

单例存在哪些问题？

单例与静态类的区别？

有何替代的解决方案？