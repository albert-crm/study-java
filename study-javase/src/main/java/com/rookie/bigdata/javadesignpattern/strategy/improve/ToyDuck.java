package com.rookie.bigdata.javadesignpattern.strategy.improve;

/**
 * @Class ToyDuck
 * @Description
 * @Author rookie
 * @Date 2024/4/28 11:57
 * @Version 1.0
 */
public class ToyDuck extends Duck{


    public ToyDuck() {
        //  Auto-generated constructor stub
        flyBehavior = new NoFlyBehavior();
    }

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


}
