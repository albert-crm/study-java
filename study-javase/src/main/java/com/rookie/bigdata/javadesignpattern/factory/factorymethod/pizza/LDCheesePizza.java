package com.rookie.bigdata.javadesignpattern.factory.factorymethod.pizza;

/**
 * @Class LDCheesePizza
 * @Description
 * @Author rookie
 * @Date 2024/4/19 17:25
 * @Version 1.0
 */
public class LDCheesePizza extends Pizza{

    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("伦敦的奶酪pizza");
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }
}
