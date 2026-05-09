package com.xsun.loopfor;

import java.util.Scanner;

public class ForDemo4 {
    //S(n)=1-2+3-4+5-6+7-8+9-10+……
    static void main(String[] args) {
        int sum = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入n：");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            if(i%2==0) sum-=i;
            else sum+=i;
        }
        System.out.println("S(n)="+sum);
    }
}
