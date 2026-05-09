package com.xsun.loopwhile;

import java.util.Scanner;

public class WhileDemo3 {
    //整数n,计算数位之和。若为负数，先取绝对值
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        if (n<0) n = -n;
        int sum = 0;
        while (n>0){
            sum += n%10;
            n /= 10;
        }
        System.out.println("数位之和为："+sum);
    }
}
