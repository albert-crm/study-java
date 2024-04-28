package com.rookie.bigdata.javadesignpattern.singleton.type1;

/**
 * @Class SingletonTest01
 * @Description
 * @Author rookie
 * @Date 2024/4/26 17:31
 * @Version 1.0
 */
public class SingletonTest01 {

    public static void main(String[] args) {
        //测试
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton2 == singleton);

        System.out.println("singleton.hashCode=" + singleton.hashCode());
        System.out.println("singleton2.hashCode=" + singleton2.hashCode());
    }
}
