package com.rookie.bigdata.javadesignpattern.proxy.staticproxy;

/**
 * @Class TeacherDao
 * @Description
 * @Author rookie
 * @Date 2024/4/19 14:41
 * @Version 1.0
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println(" 老师授课中  。。。。。");
    }

}
