package com.xsun.array;
//LeetCode 1.两数之和
import java.util.Scanner;

public class ArrayPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {3, 2, 12, 5, 4, 3, 2, 7, 8, 0, 11, 12, 3, 5, 3, 9, 17};

        System.out.println("整数数组为");
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(nums[i]);
            if (i == nums.length - 1) System.out.println();
        }

        System.out.println("请输入目标数字：");
        int target = sc.nextInt();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    count++;
                    System.out.println("第"+count+"对数字:");
                    System.out.println("数字:"+nums[i]+" index:"+ i);
                    System.out.println("数字:"+nums[j]+" index:"+ j);
                    System.out.println();
//                    return;
                }
            }
        }
        if(count==0) System.out.println("没有找到");
        else System.out.println("找到"+count+"对数字");
    }
}
