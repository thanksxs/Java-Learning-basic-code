package com.xsun.Continue;

import java.util.Scanner;

public class demo1 {
    static void main(String[] args) {
        System.out.println("请输入一个1~100000之间整数");
        Scanner sc=new Scanner(System.in);
        int num;
        while(true){
            num=sc.nextInt();
            if(num<1||num>100000){
                System.out.println("输入错误，请重新输入");
            }
            else{
                break;
            }
        }
        for(int i = 1; i <= num; i++){
            if(i%4==0||i%10==4||i/10%10==4||i/100%10==4||i/1000%10==4||i/10000%10==4){
                continue;
            }
            System.out.println(i);
        }

    }
}
