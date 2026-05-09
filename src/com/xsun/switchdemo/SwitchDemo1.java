package com.xsun.switchdemo;

import java.util.Scanner;

public class SwitchDemo1 {
    //根据用户输入月份，输出季节
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = sc.nextInt();

        /*switch(month){
            case 1:
            case 2:
            case 12:
                System.out.println("输入的月份是冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("输入的月份是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("输入的月份是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("输入的月份是秋季");
                break;
            default:
                System.out.println("输入的月份有误");
                break;*/
        switch (month){
            case 12,1,2-> System.out.println("输入的月份是冬季");
            case 3,4,5-> System.out.println("输入的月份是春季");
            case 6,7,8-> System.out.println("输入的月份是夏季");
            case 9,10,11-> System.out.println("输入的月份是秋季");
            default -> System.out.println("输入的月份有误");
        }
    }
}
