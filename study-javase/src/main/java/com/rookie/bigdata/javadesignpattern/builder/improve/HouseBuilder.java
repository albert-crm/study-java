package com.rookie.bigdata.javadesignpattern.builder.improve;

/**
 * @Class HouseBuilder
 * @Description 抽象的建造者
 * @Author rookie
 * @Date 2024/4/24 9:23
 * @Version 1.0
 */
public abstract class HouseBuilder {

    protected House house = new House();

    //将建造的流程写好, 抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建造房子好， 将产品(房子) 返回
    public House buildHouse() {
        return house;
    }

}
