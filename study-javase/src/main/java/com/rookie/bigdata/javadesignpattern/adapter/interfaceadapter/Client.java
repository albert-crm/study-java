package com.rookie.bigdata.javadesignpattern.adapter.interfaceadapter;

/**
 * @Class Client
 * @Description
 * @Author rookie
 * @Date 2024/4/28 10:03
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {

        AbsAdapter absAdapter = new AbsAdapter() {
            //只需要去覆盖我们 需要使用 接口方法
            @Override
            public void m1() {
                //  Auto-generated method stub
                System.out.println("使用了m1的方法");
            }
        };

        absAdapter.m1();
    }
}
