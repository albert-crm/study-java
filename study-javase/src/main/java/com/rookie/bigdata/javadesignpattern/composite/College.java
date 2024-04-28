package com.rookie.bigdata.javadesignpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class College
 * @Description
 * @Author rookie
 * @Date 2024/4/28 10:17
 * @Version 1.0
 */
public class College extends OrganizationComponent {

    //List 中 存放的Department
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    // 构造器
    public College(String name, String des) {
        super(name, des);
        //  Auto-generated constructor stub
    }

    // 重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        //  Auto-generated method stub
        //  将来实际业务中，Colleage 的 add 和  University add 不一定完全一样
        organizationComponents.add(organizationComponent);
    }

    // 重写remove
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        //  Auto-generated method stub
        organizationComponents.remove(organizationComponent);
    }

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

    // print方法，就是输出University 包含的学院
    @Override
    protected void print() {
        //  Auto-generated method stub
        System.out.println("--------------" + getName() + "--------------");
        //遍历 organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }


}

