package com.rookie.bigdata.javadesignpattern.factory.absfactory.order;

import com.rookie.bigdata.javadesignpattern.factory.absfactory.pizza.Pizza;

/**
 * @Class AbsFactory
 * @Description 一个抽象工厂模式的抽象层(接口)
 * @Author rookie
 * @Date 2024/4/19 16:23
 * @Version 1.0
 */
public interface AbsFactory {
    //让下面的工厂子类来 具体实现
    public Pizza createPizza(String orderType);
}
