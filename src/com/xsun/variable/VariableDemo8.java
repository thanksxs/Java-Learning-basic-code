package com.xsun.variable;

import java.util.Scanner;

public class VariableDemo8 {
    static void main(String[] args) {
        //键盘录入身高和体重，输出BMI
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入身高(m)：");
        double height=sc.nextDouble();
        System.out.println("请输入体重(kg)：");
        double weight=sc.nextDouble();
        System.out.println("身高："+height);
        System.out.println("体重："+weight);
        double bmi=weight/(height*height);
        System.out.println("BMI："+bmi);
    }
}
