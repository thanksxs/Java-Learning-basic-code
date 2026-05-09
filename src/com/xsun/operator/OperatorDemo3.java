package com.xsun.operator;

import java.util.Scanner;

public class OperatorDemo3 {
    static void main(String[] args) {
        //给定秒数，将秒数拆分为时分秒，要求分和秒都不超过59
        //输出为1行，包括三个整数，分别代表时分秒

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入秒数：(0~10^8之间)");
        int seconds=sc.nextInt();
        int h=seconds/3600;
        int m=(seconds%3600)/60;
        int s=(seconds%3600)%60;
        System.out.println(h+" "+m+" "+s);
    }
}
