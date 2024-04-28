package com.rookie.bigdata.javadesignpattern.strategy;

/**
 * @Class PekingDuck
 * @Description
 * @Author rookie
 * @Date 2024/4/28 11:52
 * @Version 1.0
 */
public class PekingDuck extends Duck {

    @Override
    public void display() {
        //  Auto-generated method stub
        System.out.println("~~北京鸭~~~");
    }

    //因为北京鸭不能飞翔，因此需要重写fly
    @Override
    public void fly() {
        //  Auto-generated method stub
        System.out.println("北京鸭不能飞翔");
    }

}
