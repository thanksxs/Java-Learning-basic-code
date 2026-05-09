package com.xsun.array;

import java.util.Random;
//先从0-11范围内随机生成长度为10的数组，然后给数组去重
public class ArrayDemo6 {
    static void main(String[] args) {
        int[] arr={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int[] arr2=arr.clone();
        Random r = new Random();
        System.out.println("去重前的数组为：");
        for (int i = 0; i < 10; i++) {
            arr[i]=r.nextInt(11    );
            if (i>0) System.out.print(","+arr[i]);
            else System.out.print(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            boolean flag;
            do {
                flag = false;

                for (int j = 0; j < i; j++) {
                    if (arr[i]==arr2[j]) {
                        flag = true;
                        arr[i]=r.nextInt(11);
                        break;
                    }
                }
                if(!flag) arr2[i]=arr[i];
            }while (flag);
        }
        System.out.println("\n去重后的数组为：");
        for (int i = 0; i < arr2.length; i++) {
            if (i>0) System.out.print(","+arr2[i]);
            else System.out.print(arr2[i]);
        }
    }
}
