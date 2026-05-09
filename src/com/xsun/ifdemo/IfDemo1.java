package com.xsun.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体温：");
        double temp = sc.nextDouble();

        if (temp>=38){
            System.out.println("发烧了");
        }
        else {
            System.out.println("没发烧");
        }
    }
}
