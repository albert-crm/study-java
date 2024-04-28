package com.rookie.bigdata.javadesignpattern.composite;

/**
 * @Class Department
 * @Description
 * @Author rookie
 * @Date 2024/4/28 10:18
 * @Version 1.0
 */
public class Department extends OrganizationComponent {

    //没有集合

    public Department(String name, String des) {
        super(name, des);
        //  Auto-generated constructor stub
    }


    //add , remove 就不用写了，因为他是叶子节点

    @Override
    public String getName() {
        //  Auto-generated method stub
        return super.getName();
    }

    @Override
    public String getDes() {
        //  Auto-generated method stub
        return super.getDes();
    }

    @Override
    protected void print() {
        //  Auto-generated method stub
        System.out.println(getName());
    }

}
