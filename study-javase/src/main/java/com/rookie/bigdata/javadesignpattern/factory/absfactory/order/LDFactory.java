package com.rookie.bigdata.javadesignpattern.factory.absfactory.order;

import com.rookie.bigdata.javadesignpattern.factory.absfactory.pizza.LDCheesePizza;
import com.rookie.bigdata.javadesignpattern.factory.absfactory.pizza.LDPepperPizza;
import com.rookie.bigdata.javadesignpattern.factory.absfactory.pizza.Pizza;

/**
 * @Class LDFactory
 * @Description TODO
 * @Author rookie
 * @Date 2024/4/19 16:24
 * @Version 1.0
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}
