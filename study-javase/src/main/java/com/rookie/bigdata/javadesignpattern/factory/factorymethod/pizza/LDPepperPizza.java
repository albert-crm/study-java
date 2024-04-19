package com.rookie.bigdata.javadesignpattern.factory.factorymethod.pizza;

/**
 * @Class LDPepperPizza
 * @Description
 * @Author rookie
 * @Date 2024/4/19 17:24
 * @Version 1.0
 */
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        //  Auto-generated method stub
        setName("伦敦的胡椒pizza");
        System.out.println(" 伦敦的胡椒pizza 准备原材料");
    }
}
