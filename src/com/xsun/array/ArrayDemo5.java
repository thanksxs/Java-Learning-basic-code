package com.xsun.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        
        System.out.println("生成10个1-100的不重复随机数");
        
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate;
            do {
                isDuplicate = false;
                int num = r.nextInt(100) + 1;
                
                for (int j = 0; j < i; j++) {
                    if (arr[j] == num) {
                        isDuplicate = true;
                        break;
                    }
                }
                
                if (!isDuplicate) {
                    arr[i] = num;
                }
            } while (isDuplicate);
        }
        
        System.out.println("完整的数组为：");
        System.out.print("arr=[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}
