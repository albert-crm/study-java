package com.rookie.bigdata.javadesignpattern.iterator;

import java.util.Iterator;

/**
 * @Class College
 * @Description
 * @Author rookie
 * @Date 2024/4/28 13:50
 * @Version 1.0
 */
public interface College {

    public String getName();

    //增加系的方法
    public void addDepartment(String name, String desc);

    //返回一个迭代器,遍历
    public Iterator  createIterator();
}

