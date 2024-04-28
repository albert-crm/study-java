package com.rookie.bigdata.javadesignpattern.type8;

/**
 * @Class Singleton
 * @Description 使用枚举，可以实现单例, 推荐
 * @Author rookie
 * @Date 2024/4/28 9:35
 * @Version 1.0
 */
public enum Singleton {
    INSTANCE; //属性

    public void sayOK() {
        System.out.println("ok~");
    }
}
