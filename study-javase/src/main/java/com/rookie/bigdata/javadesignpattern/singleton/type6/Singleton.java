package com.rookie.bigdata.javadesignpattern.singleton.type6;

/**
 * @Class Singleton
 * @Description 双重检查
 * @Author rookie
 * @Date 2024/4/26 18:07
 * @Version 1.0
 */
public class Singleton {

    private static volatile Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }

            }
        }
        return singleton;
    }
}
