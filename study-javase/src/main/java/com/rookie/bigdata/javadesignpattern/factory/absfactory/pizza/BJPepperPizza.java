package com.rookie.bigdata.javadesignpattern.factory.absfactory.pizza;

/**
 * @Class BJPepperPizza
 * @Description
 * @Author rookie
 * @Date 2024/4/19 16:27
 * @Version 1.0
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        // TODO Auto-generated method stub
        setName("北京的胡椒pizza");
        System.out.println(" 北京的胡椒pizza 准备原材料");
    }
}
