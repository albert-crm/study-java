package com.rookie.bigdata.javadesignpattern.decorator;

/**
 * @Class Milk
 * @Description
 * @Author rookie
 * @Date 2024/4/28 10:50
 * @Version 1.0
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        //  Auto-generated constructor stub
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }

}
