package com.rookie.bigdata.javadesignpattern.decorator;

/**
 * @Class Chocolate
 * @Description 具体的Decorator， 这里就是调味品
 * @Author rookie
 * @Date 2024/4/28 10:52
 * @Version 1.0
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");
        setPrice(3.0f); // 调味品 的价格
    }

}
