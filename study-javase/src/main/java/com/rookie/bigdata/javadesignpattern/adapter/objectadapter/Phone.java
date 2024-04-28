package com.rookie.bigdata.javadesignpattern.adapter.objectadapter;

/**
 * @Class Phone
 * @Description TODO
 * @Author rookie
 * @Date 2024/4/28 10:00
 * @Version 1.0
 */
public class Phone {

    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V, 可以充电~~");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V, 不能充电~~");
        }
    }
}
