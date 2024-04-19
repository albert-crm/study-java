package com.rookie.bigdata.javadesignpattern.factory.absfactory.order;

import com.rookie.bigdata.javadesignpattern.factory.absfactory.pizza.BJCheesePizza;
import com.rookie.bigdata.javadesignpattern.factory.absfactory.pizza.BJPepperPizza;
import com.rookie.bigdata.javadesignpattern.factory.absfactory.pizza.Pizza;

/**
 * @Class BJFactory
 * @Description 这是工厂子类
 * @Author rookie
 * @Date 2024/4/19 16:24
 * @Version 1.0
 */
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        //  Auto-generated method stub
        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }

}

