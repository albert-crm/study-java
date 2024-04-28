package com.rookie.bigdata.javadesignpattern.adapter.classadapter;

/**
 * @Class Phone
 * @Description
 * @Author rookie
 * @Date 2024/4/28 9:50
 * @Version 1.0
 */
public class Phone {


    //充电
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V, 可以充电~~");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V, 不能充电~~");
        }
    }
}
