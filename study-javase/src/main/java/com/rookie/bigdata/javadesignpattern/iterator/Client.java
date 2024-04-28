package com.rookie.bigdata.javadesignpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class Client
 * @Description
 * @Author rookie
 * @Date 2024/4/28 13:53
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        //  Auto-generated method stub
        //创建学院
        List<College> collegeList = new ArrayList<College>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        //collegeList.add(infoCollege);

        OutPutImpl outPutImpl = new OutPutImpl(collegeList);
        outPutImpl.printCollege();
    }

}
