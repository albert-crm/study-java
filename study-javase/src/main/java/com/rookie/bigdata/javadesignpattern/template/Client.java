package com.rookie.bigdata.javadesignpattern.template;

/**
 * @Class Client
 * @Description
 * @Author rookie
 * @Date 2024/4/28 11:13
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        //  Auto-generated method stub
        //制作红豆豆浆

        System.out.println("----制作红豆豆浆----");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("----制作花生豆浆----");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }

}
