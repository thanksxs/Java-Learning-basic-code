package com.xsun.test;

import static java.lang.Math.min;

public class Test2 {
    static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        baolifa(height);

    }

    public static void baolifa(int[] height) {
        int total = 0;
        int left = 0;
        int right = 0;
        int index = 0;
        for (int i = 0; i < height.length; ) {
            //从左到右，一次看每列能存多少水。
            // 能装水的前提是中间小于等于两边left和right的最高值
            // 一旦i的高度大于左边，那么left——>i,如果i=right,那么一定不能存水
            //每列存的水=min(height[left],height[right])-height[i]
            //判断left和right的值：
            if (height[i] >= height[left]) {
                left = i;
                i++;
                continue;
            }
            //一旦i=rigth,重新遍历,选出新的right
            else if(i== height.length-1) {
                i++;
                continue;
            }
            if (i >= right) {
                right = i;
                for (int j = i+1; j < height.length; j++) {
                    if (height[j] > height[right]) {
                        right = j;
                    }
                }

            }
            if (height[right]>=height[i]){
                total += min(height[left], height[right]) - height[i];
                i++;
            }
            else i++;

        }

        System.out.println(total);
    }
}
