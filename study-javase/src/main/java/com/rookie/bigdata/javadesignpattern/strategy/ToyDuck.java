package com.rookie.bigdata.javadesignpattern.strategy;

/**
 * @Class ToyDuck
 * @Description
 * @Author rookie
 * @Date 2024/4/28 11:52
 * @Version 1.0
 */
public class ToyDuck extends Duck{

    @Override
    public void display() {
        //  Auto-generated method stub
        System.out.println("玩具鸭");
    }

    //需要重写父类的所有方法

    public void quack() {
        System.out.println("玩具鸭不能叫~~");
    }

    public void swim() {
        System.out.println("玩具鸭不会游泳~~");
    }

    public void fly() {
        System.out.println("玩具鸭不会飞翔~~~");
    }
}
