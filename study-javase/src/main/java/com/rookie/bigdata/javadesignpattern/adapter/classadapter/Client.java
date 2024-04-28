package com.rookie.bigdata.javadesignpattern.adapter.classadapter;

/**
 * @Class Client
 * @Description
 * @Author rookie
 * @Date 2024/4/28 9:51
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        System.out.println(" === 类适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }

}
