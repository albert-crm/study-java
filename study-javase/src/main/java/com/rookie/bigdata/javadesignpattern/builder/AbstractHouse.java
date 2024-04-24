package com.rookie.bigdata.javadesignpattern.builder;

/**
 * @Class AbstractHouse
 * @Description
 * @Author rookie
 * @Date 2024/4/24 9:18
 * @Version 1.0
 */
public abstract class AbstractHouse {

    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }

}
