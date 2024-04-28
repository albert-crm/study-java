package com.rookie.bigdata.javadesignpattern.adapter.classadapter;

/**
 * @Class Voltage220V
 * @Description 被适配的类
 * @Author rookie
 * @Date 2024/4/28 9:46
 * @Version 1.0
 */
public class Voltage220V {

    /**
     * 输出200V的电压
     *
     * @return
     */
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }


}
