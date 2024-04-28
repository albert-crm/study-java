package com.rookie.bigdata.javadesignpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class University
 * @Description University 就是 Composite , 可以管理College
 * @Author rookie
 * @Date 2024/4/28 10:13
 * @Version 1.0
 */
public class University extends OrganizationComponent {


    List<OrganizationComponent> organizationComponents = new ArrayList<>();


    public University(String name, String des) {
        super(name, des);
    }


    @Override
    protected void add(OrganizationComponent organizationComponent) {

        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }


    /**
     * print方法，就是输出University 包含的学院
     */
    @Override
    protected void print() {

        System.out.println("----------------" + getName() + "-----------------");
        //便利organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }


    }
}
