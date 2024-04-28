package com.rookie.bigdata.javadesignpattern.strategy.improve;

/**
 * @Class NoFlyBehavior
 * @Description
 * @Author rookie
 * @Date 2024/4/28 11:55
 * @Version 1.0
 */
public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println(" 不会飞翔  ");
    }

}
