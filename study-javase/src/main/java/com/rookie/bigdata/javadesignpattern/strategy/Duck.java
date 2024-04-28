package com.rookie.bigdata.javadesignpattern.strategy;

/**
 * @Class Duck
 * @Description
 * @Author rookie
 * @Date 2024/4/28 11:52
 * @Version 1.0
 */
public abstract class Duck {

    public Duck() {

    }

    public abstract void display();//显示鸭子信息

    public void quack() {
        System.out.println("鸭子嘎嘎叫~~");
    }

    public void swim() {
        System.out.println("鸭子会游泳~~");
    }

    public void fly() {
        System.out.println("鸭子会飞翔~~~");
    }

}
