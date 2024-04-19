package com.rookie.bigdata.javadesignpattern.factory.factorymethod.pizza;

/**
 * @Class BJCheesePizza
 * @Description
 * @Author rookie
 * @Date 2024/4/19 17:24
 * @Version 1.0
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        //  Auto-generated method stub
        setName("北京的奶酪pizza");
        System.out.println(" 北京的奶酪pizza 准备原材料");
    }

}
