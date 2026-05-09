package com.xsun.array;

import java.util.Scanner;

public class ArrayDemo4 {
    static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入5个数字：");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("数组录入完毕");
        System.out.println("完整的数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

    }
}
