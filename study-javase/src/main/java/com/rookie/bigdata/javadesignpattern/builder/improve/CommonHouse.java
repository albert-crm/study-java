package com.rookie.bigdata.javadesignpattern.builder.improve;

/**
 * @Class CommonHouse
 * @Description TODO
 * @Author rookie
 * @Date 2024/4/24 9:24
 * @Version 1.0
 */
public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        //  Auto-generated method stub
        System.out.println(" 普通房子打地基5米 ");
    }

    @Override
    public void buildWalls() {
        //  Auto-generated method stub
        System.out.println(" 普通房子砌墙10cm ");
    }

    @Override
    public void roofed() {
        //  Auto-generated method stub
        System.out.println(" 普通房子屋顶 ");
    }

}
