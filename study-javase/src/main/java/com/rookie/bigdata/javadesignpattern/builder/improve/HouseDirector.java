package com.rookie.bigdata.javadesignpattern.builder.improve;

/**
 * @Class HouseDirector
 * @Description 指挥者，这里去指定制作流程，返回产品
 * @Author rookie
 * @Date 2024/4/24 9:24
 * @Version 1.0
 */
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    //构造器传入 houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过setter 传入 houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }


}
