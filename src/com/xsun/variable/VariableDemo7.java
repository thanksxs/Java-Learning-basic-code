package com.xsun.variable;

import java.util.Scanner;

public class VariableDemo7 {
    static void main(String[] args) {
        //键盘录入两个整数，并求和
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第2个整数：");
        int num2 = sc.nextInt();

        int total = num1 + num2;
        System.out.println("第1个数为:"+num1);
        System.out.println("第2个数为:"+num2);
        System.out.println(num1+"+"+num2+"=="+total);
        System.out.println("和为："+total);

    }
}
