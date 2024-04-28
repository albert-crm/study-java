package com.rookie.bigdata.javadesignpattern.decorator;

/**
 * @Class Drink
 * @Description 表示饮料
 * @Author rookie
 * @Date 2024/4/28 10:21
 * @Version 1.0
 */
public abstract class Drink {

    public String des;//描述
    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算费用的抽象方法
    //子类来实现
    public abstract float cost();
}
