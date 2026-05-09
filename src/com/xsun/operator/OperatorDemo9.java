package com.xsun.operator;

import java.util.Scanner;

public class OperatorDemo9 {
    static void main(String[] args) {
        //键盘输入一个数，判断该数是否是能被3整除

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个数：");
        int num = sc.nextInt();
        //将整数的个十百位拆分求和
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100;
        int sum = ge + shi + bai;
        //判断
        if (sum % 3 == 0) {
            System.out.println("该数是能被3整除的");
            System.out.println("和为："+sum);
        }
        else {
            System.out.println("该数不能被3整除");
        }
        System.out.println("和为："+sum);
        System.out.println("个位："+ge);
        System.out.println("十位："+shi);
        System.out.println("百位："+bai);
    }
}
