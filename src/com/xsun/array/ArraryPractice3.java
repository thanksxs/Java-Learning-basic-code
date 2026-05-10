package com.xsun.array;
//查找元素的位置，如果没有就返回应存入的位置

import java.lang.annotation.Target;

public class ArraryPractice3 {
    static void main(String[] args) {
        int[] nums={1,4,5,9,14,26,30};
        int target=0;
        int left=0;
        int right=nums.length-1;
        int middle=0;
        while (left<=right){
            middle=(left+right)/2;
            if (nums[middle]==target) {
                System.out.println("找到了，位置为："+middle);
                return;
            }
            else if (nums[middle]>target) right=middle-1;
            else left=middle+1;
            System.out.println("left:"+left+" right:"+right+" middle:"+middle);
            System.out.println("");
        }
        if (left>right){
            System.out.println("没有找到，应插入的位置为："+left);
        }

    }
}
