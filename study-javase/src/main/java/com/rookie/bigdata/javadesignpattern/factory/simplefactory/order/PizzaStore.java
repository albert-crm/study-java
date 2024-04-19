package com.rookie.bigdata.javadesignpattern.factory.simplefactory.order;

/**
 * @Class PizzaStore
 * @Description 相当于一个客户端，发出订购
 * @Author rookie
 * @Date 2024/4/19 17:14
 * @Version 1.0
 */
public class PizzaStore {

    public static void main(String[] args) {
        //  Auto-generated method stub
        //new OrderPizza();

        //使用简单工厂模式
        //new OrderPizza(new SimpleFactory());
        //System.out.println("~~退出程序~~");

        new OrderPizza2();
    }

}
