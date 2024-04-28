package com.rookie.bigdata.javadesignpattern.decorator;

/**
 * @Class Decorator
 * @Description
 * @Author rookie
 * @Date 2024/4/28 10:51
 * @Version 1.0
 */
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) { //组合
        //  Auto-generated constructor stub
        this.obj = obj;
    }

    @Override
    public float cost() {
        //  Auto-generated method stub
        // getPrice 自己价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        //  Auto-generated method stub
        // obj.getDes() 输出被装饰者的信息
        return des + " " + getPrice() + " && " + obj.getDes();
    }



}
