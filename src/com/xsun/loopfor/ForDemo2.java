package com.xsun.loopfor;

import java.util.Scanner;

public class ForDemo2 {
    static void main(String[] args) {
        //键入两个数字表示范围。统计这个范围里，既能被6整除，也能被8整除的数字的个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入下界：");
        int left =sc.nextInt();
        System.out.println("请输入上界：");
        int right =sc.nextInt();
        int count = 0;
        for(int i = left; i <= right; i++){
            if(i % 6 == 0 && i % 8 == 0) count++;
        }
        System.out.println("个数：" + count);
    }
}
