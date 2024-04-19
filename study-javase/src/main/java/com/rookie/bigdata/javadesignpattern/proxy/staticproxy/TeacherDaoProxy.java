package com.rookie.bigdata.javadesignpattern.proxy.staticproxy;

/**
 * @Class TeacherDaoProxy
 * @Description 代理对象, 静态代理
 * @Author rookie
 * @Date 2024/4/19 14:41
 * @Version 1.0
 */
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target; // 目标对象，通过接口来聚合


    //构造器
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }


    @Override
    public void teach() {
        System.out.println("开始代理  完成某些操作。。。。。 ");//方法
        target.teach();
        System.out.println("提交。。。。。");//方法
    }

}
