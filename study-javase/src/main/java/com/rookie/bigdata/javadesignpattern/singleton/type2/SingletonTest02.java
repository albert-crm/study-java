package com.rookie.bigdata.javadesignpattern.singleton.type2;

/**
 * @Class SingletonTest02
 * @Description
 * @Author rookie
 * @Date 2024/4/26 17:54
 * @Version 1.0
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}
