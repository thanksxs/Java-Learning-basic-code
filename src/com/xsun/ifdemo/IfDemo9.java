package com.xsun.ifdemo;

import java.util.Scanner;

public class IfDemo9 {
    static void main(String[] args) {
        //计算电费，梯度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入使用电量：");
        double useage = sc.nextInt();
        double cost = 0;
        if(useage<=100)cost = useage*0.5;
        else if(useage<=200) cost = 100*0.5+(useage-100)*0.8;
        else cost = 100*0.5+100*0.8+(useage-200)*1.2;
        System.out.println("电费为："+cost+"元");
    }
}
