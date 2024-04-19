package com.rookie.bigdata.javadesignpattern.proxy.cglib;

/**
 * @Class TeacherDao
 * @Description
 * @Author rookie
 * @Date 2024/4/19 14:45
 * @Version 1.0
 */
public class TeacherDao {

    public String teach() {
        System.out.println(" 老师授课中  ， 我是cglib代理，不需要实现接口 ");
        return "hello";
    }
}
