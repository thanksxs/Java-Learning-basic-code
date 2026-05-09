package com.xsun.ifdemo;

import java.util.Scanner;

public class IfDemo10 {
    static void main(String[] args) {
        //键盘录入三个数，判断是否能构成三角形，并判断三角形的类型
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个数：");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("可以构成三角形");
            if (a == b && b== c) System.out.println("等边三角形");
            else if(a == b || b == c || a == c) {
                if (a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a){
                    System.out.println("等腰直角三角形");
                }else System.out.println("等腰三角形");
            }else if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a) {
                System.out.println("直角三角形");
            }else System.out.println("普通三角形");
        }else System.out.println("不能构成三角形");
    }
}
