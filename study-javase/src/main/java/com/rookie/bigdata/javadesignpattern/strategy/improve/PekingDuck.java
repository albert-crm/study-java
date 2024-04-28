package com.rookie.bigdata.javadesignpattern.strategy.improve;

/**
 * @Class PekingDuck
 * @Description
 * @Author rookie
 * @Date 2024/4/28 11:56
 * @Version 1.0
 */

public class PekingDuck extends Duck {


    //假如北京鸭可以飞翔，但是飞翔技术一般
    public PekingDuck() {
        // TODO Auto-generated constructor stub
        flyBehavior = new BadFlyBehavior();

    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("~~北京鸭~~~");
    }



}
