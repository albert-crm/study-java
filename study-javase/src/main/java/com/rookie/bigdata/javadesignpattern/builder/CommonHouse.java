package com.rookie.bigdata.javadesignpattern.builder;

/**
 * @Class CommonHouse
 * @Description
 * @Author rookie
 * @Date 2024/4/24 9:18
 * @Version 1.0
 */
public class CommonHouse extends AbstractHouse {

    @Override
    public void buildBasic() {
        //  Auto-generated method stub
        System.out.println(" 普通房子打地基 ");
    }

    @Override
    public void buildWalls() {
        // TODO Auto-generated method stub
        System.out.println(" 普通房子砌墙 ");
    }

    @Override
    public void roofed() {
        // TODO Auto-generated method stub
        System.out.println(" 普通房子封顶 ");
    }

}
