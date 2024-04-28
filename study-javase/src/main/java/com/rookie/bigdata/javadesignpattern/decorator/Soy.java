package com.rookie.bigdata.javadesignpattern.decorator;

/**
 * @Class Soy
 * @Description
 * @Author rookie
 * @Date 2024/4/28 10:51
 * @Version 1.0
 */
public class Soy extends Decorator{

    public Soy(Drink obj) {
        super(obj);
        //  Auto-generated constructor stub
        setDes(" 豆浆  ");
        setPrice(1.5f);
    }

}
