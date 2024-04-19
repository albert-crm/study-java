package com.rookie.bigdata.javadesignpattern.proxy.cglib;

/**
 * @Class Client
 * @Description https://blog.csdn.net/xtrans/article/details/136783971
 * @Author rookie
 * @Date 2024/4/19 14:45
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        //  Auto-generated method stub
        //创建目标对象
        TeacherDao target = new TeacherDao();
        //获取到代理对象，并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法，触发intecept 方法，从而实现 对目标对象的调用
        String res = proxyInstance.teach();
        System.out.println("res=" + res);
    }

}
