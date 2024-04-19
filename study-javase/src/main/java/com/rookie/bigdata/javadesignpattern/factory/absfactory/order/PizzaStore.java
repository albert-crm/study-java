package com.rookie.bigdata.javadesignpattern.factory.absfactory.order;

/**
 * @Class PizzaStore
 * @Description
 * @Author rookie
 * @Date 2024/4/19 16:25
 * @Version 1.0
 */
public class PizzaStore {

    public static void main(String[] args) {
        //  Auto-generated method stub
        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }

}
