package com.rookie.bigdata.javadesignpattern.strategy.improve;

/**
 * @Class WildDuck
 * @Description
 * @Author rookie
 * @Date 2024/4/28 11:57
 * @Version 1.0
 */
public class WildDuck extends Duck {


    //构造器，传入FlyBehavor 的对象
    public  WildDuck() {
        //  Auto-generated constructor stub
        flyBehavior = new GoodFlyBehavior();
    }


    @Override
    public void display() {
        //  Auto-generated method stub
        System.out.println(" 这是野鸭 ");
    }

}
