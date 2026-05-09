package com.xsun.ifdemo;

import java.util.Scanner;

public class IfDemo6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println("偶数");
            System.out.println(num/2);
        }else{
            System.out.println("奇数");
            System.out.println(num*3+1);
        }
    }
}
