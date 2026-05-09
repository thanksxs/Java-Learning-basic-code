package com.xsun.operator;

import java.util.Scanner;

public class OperatorDemo2 {
    static void main(String[] args) {
        //键盘录入三位数，将个位、十位、百位分别拆分并打印
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三位数：");
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100;
        System.out.println("输入的数字为："+ num);
        System.out.println("个位："+ge);
        System.out.println("十位："+shi);
        System.out.println("百位："+bai);
    }
}
