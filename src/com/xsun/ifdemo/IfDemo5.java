package com.xsun.ifdemo;

import java.util.Scanner;

public class IfDemo5 {
    static void main(String[] args) {
        //饿了么9折，美团满30减10
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入外卖价格：");
        double total = sc.nextDouble();
        //饿了么：
        double total1 = total * 0.9;
        System.out.println("饿了么9折，应付："+total1);
        //美团：
        double total2 = total >= 30 ? total - 10 : total;
        System.out.println("美团10元减10，应付："+total2);
        if (total2>total1){
            System.out.println("饿了么更优惠");
        }else if(total2<total1){
            System.out.println("美团更优惠");
        }else if(total2==total1){
            System.out.println("一样优惠");
        }
    }
}
