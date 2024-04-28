package com.rookie.bigdata.javadesignpattern.singleton.type4;

/**
 * @Class Singleton
 * @Description 懒汉式(线程安全 ， 同步方法)
 * @Author rookie
 * @Date 2024/4/26 17:58
 * @Version 1.0
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    //提供一个静态的公共方法，加入同步处理代码,解决线程安全问题
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
