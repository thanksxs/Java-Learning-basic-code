package com.xsun.ifdemo;

import java.util.Scanner;

public class IfDemo8 {
    static void main(String[] args) {
        //输入身高和体重，计算BMI，并判断
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高：(m)");
        double height=sc.nextDouble();
        System.out.println("请输入体重：(kg)");
        double weight=sc.nextDouble();
        double bmi=weight/(height*height);
        System.out.println("BMI："+bmi);
        if(bmi<18.5) System.out.println("消瘦，健康风险部分增加");
        else if(bmi<24) System.out.println("正常，健康");
        else if(bmi<27) System.out.println("偏胖，健康风险增加");
        else if(bmi<30) System.out.println("肥胖，健康风险中度增加");
        else System.out.println("严重肥胖，健康风险严重增加");
    }
}
