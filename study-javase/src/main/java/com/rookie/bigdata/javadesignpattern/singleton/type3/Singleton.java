package com.rookie.bigdata.javadesignpattern.singleton.type3;

/**
 * @Class Singleton
 * @Description 懒汉式
 * @Author rookie
 * @Date 2024/4/26 17:55
 * @Version 1.0
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    //提供一个静态的公有方法，当使用到该方法时，才去创建instance

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
