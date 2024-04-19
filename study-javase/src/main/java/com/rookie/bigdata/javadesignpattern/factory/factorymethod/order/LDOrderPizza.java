package com.rookie.bigdata.javadesignpattern.factory.factorymethod.order;

import com.rookie.bigdata.javadesignpattern.factory.factorymethod.pizza.LDCheesePizza;
import com.rookie.bigdata.javadesignpattern.factory.factorymethod.pizza.LDPepperPizza;
import com.rookie.bigdata.javadesignpattern.factory.factorymethod.pizza.Pizza;

/**
 * @Class LDOrderPizza
 * @Description
 * @Author rookie
 * @Date 2024/4/19 17:23
 * @Version 1.0
 */
public class LDOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }

}
