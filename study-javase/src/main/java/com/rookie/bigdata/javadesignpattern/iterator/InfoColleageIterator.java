package com.rookie.bigdata.javadesignpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Class InfoColleageIterator
 * @Description TODO
 * @Author rookie
 * @Date 2024/4/28 13:51
 * @Version 1.0
 */
public class InfoColleageIterator implements Iterator {


    List<Department> departmentList; // 信息工程学院是以List方式存放系
    int index = -1;//索引


    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //判断list中还有没有下一个元素
    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        if(index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        // TODO Auto-generated method stub
        return departmentList.get(index);
    }

    //空实现remove
    public void remove() {

    }

}
