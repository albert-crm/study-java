package com.rookie.bigdata.javadesignpattern.factory.factorymethod.order;

import com.rookie.bigdata.javadesignpattern.factory.factorymethod.pizza.BJCheesePizza;
import com.rookie.bigdata.javadesignpattern.factory.factorymethod.pizza.BJPepperPizza;
import com.rookie.bigdata.javadesignpattern.factory.factorymethod.pizza.Pizza;

/**
 * @Class BJOrderPizza
 * @Description
 * @Author rookie
 * @Date 2024/4/19 17:23
 * @Version 1.0
 */
public class BJOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        //  Auto-generated method stub
        return pizza;
    }

}
