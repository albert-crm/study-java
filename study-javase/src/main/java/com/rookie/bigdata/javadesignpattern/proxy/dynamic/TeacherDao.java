package com.rookie.bigdata.javadesignpattern.proxy.dynamic;

/**
 * @Class TeacherDao
 * @Description
 * @Author rookie
 * @Date 2024/4/19 14:43
 * @Version 1.0
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        //  Auto-generated method stub
        System.out.println(" 老师授课中.... ");
    }

    @Override
    public void sayHello(String name) {
        //  Auto-generated method stub
        System.out.println("hello " + name);
    }

}

