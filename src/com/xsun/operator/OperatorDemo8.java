package com.xsun.operator;

import java.util.Scanner;

public class OperatorDemo8 {
    static void main(String[] args) {
        //键盘录入两个人的身高，比较

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第1个人的身高(m)：");
        double h1=sc.nextDouble();
        System.out.println("请输入第2个人的身高：");
        double h2=sc.nextDouble();
        if(h1>h2){
            System.out.println("第1个人高");
        }
        else{
            System.out.println("第2个人高");
        }

    }
}
