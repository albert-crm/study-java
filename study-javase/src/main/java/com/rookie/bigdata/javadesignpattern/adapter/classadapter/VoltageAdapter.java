package com.rookie.bigdata.javadesignpattern.adapter.classadapter;

/**
 * @Class VoltageAdapter
 * @Description 适配器类
 * @Author rookie
 * @Date 2024/4/28 9:48
 * @Version 1.0
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获取到200V电压
        int srcV = output220V();
        int dstV = srcV / 44;//转成5v
        return dstV;
    }
}
