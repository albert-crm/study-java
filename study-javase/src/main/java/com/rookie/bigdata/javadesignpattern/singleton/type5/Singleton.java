package com.rookie.bigdata.javadesignpattern.singleton.type5;

/**
 * @Class Singleton
 * @Description 懒汉式(线程安全 ， 同步代码块)
 * @Author rookie
 * @Date 2024/4/26 18:05
 * @Version 1.0
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
