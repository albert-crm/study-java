package com.rookie.bigdata.javadesignpattern.iterator;

/**
 * @Class Department
 * @Description
 * @Author rookie
 * @Date 2024/4/28 13:52
 * @Version 1.0
 */
public class Department {

    private String name;
    private String desc;
    public Department(String name, String desc) {
        super();
        this.name = name;
        this.desc = desc;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }



}
