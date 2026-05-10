package com.xsun.method;

import java.util.Scanner;

//快递计费：录入重量，不足1kg按1kg。
//重量>0,分段计费
public class MethodDemo2 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入重量：");
        double input=sc.nextDouble();
        double weight;
        while (input<=0){
            System.out.println("输入的数字有误，请重新输入");
            input=sc.nextDouble();
        }
        weight=Math.ceil(input);
        System.out.println("重量为："+ weight+"kg");
        double price=0;
        if (weight==1){
            price=getPrice1(weight);
        }
        else if (weight>1 && weight<=6){
            price=getPrice2(weight);
        }
        else if (weight>6){
            price=getPrice3(weight);
        }
        System.out.println("运费为："+ price+"元");
    }
    //首重：weight=1kg  10元
    public static double getPrice1(double weight){
        return 10;
    }
    //超出1-5kg 2元/ kg (1-6kg)
    public static double getPrice2(double weight){
        return (weight-1)*2+10;
    }
    //超出5以上 1.5元/ kg
    public static double getPrice3(double weight){
        return (weight-1)*1.5+10;
    }
}
