package com.xsun.variable;

import java.util.Scanner;

//键盘录入
public class VariableDemo6 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //接受键盘录入整数
        int numInt=sc.nextInt();
        //接受键盘录入浮点数
        double numDouble=sc.nextDouble();
        //接受键盘录入整字符串
        String str=sc.next();

        System.out.println("整数："+numInt);
        System.out.println("浮点数："+numDouble);
        System.out.println("字符串："+ str);
    }
}
