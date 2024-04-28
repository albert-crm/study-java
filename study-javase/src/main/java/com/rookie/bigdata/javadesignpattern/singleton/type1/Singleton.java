package com.rookie.bigdata.javadesignpattern.singleton.type1;

/**
 * @Class Singleton
 * @Description 饿汉式(静态变量)
 * @Author rookie
 * @Date 2024/4/26 17:31
 * @Version 1.0
 */
public class Singleton {

    //1. 构造器私有化, 外部能new
    private Singleton() {

    }

    //2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }

}
