package com.rookie.bigdata.javadesignpattern.factory.factorymethod.order;

/**
 * @Class PizzaStore
 * @Description
 * @Author rookie
 * @Date 2024/4/19 17:22
 * @Version 1.0
 */
public class PizzaStore {

    public static void main(String[] args) {
        String loc = "bj";
        if (loc.equals("bj")) {
            //创建北京口味的各种Pizza
            new BJOrderPizza();
        } else {
            //创建伦敦口味的各种Pizza
            new LDOrderPizza();
        }
        //  Auto-generated method stub
    }

}
