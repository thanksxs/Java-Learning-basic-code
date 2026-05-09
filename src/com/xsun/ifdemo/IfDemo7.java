package com.xsun.ifdemo;

import java.util.Scanner;

public class IfDemo7 {
    static void main(String[] args) {
        //充值金额，卡内余额
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入充值金额：");
        double money=sc.nextDouble();
        double balance=0;

        if(money<1000) balance=money;
        else if(money<2000) balance=money+200;
        else if(money<3000) balance=money+500;
        else if(money<5000) balance=money+700;
        else if(money<10000) balance=money+1300;
        else if(money<20000) balance=money+2500 ;
        else if (money<50000) balance=money+6000;
        else balance=money+15000;
        System.out.println("卡内余额为："+balance);
    }
}
