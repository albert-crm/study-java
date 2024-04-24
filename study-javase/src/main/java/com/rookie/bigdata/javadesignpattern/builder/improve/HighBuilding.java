package com.rookie.bigdata.javadesignpattern.builder.improve;

/**
 * @Class HighBuilding
 * @Description
 * @Author rookie
 * @Date 2024/4/24 9:24
 * @Version 1.0
 */
public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        //  Auto-generated method stub
        System.out.println(" 高楼的打地基100米 ");
    }

    @Override
    public void buildWalls() {
        //  Auto-generated method stub
        System.out.println(" 高楼的砌墙20cm ");
    }

    @Override
    public void roofed() {
        //  Auto-generated method stub
        System.out.println(" 高楼的透明屋顶 ");
    }

}
