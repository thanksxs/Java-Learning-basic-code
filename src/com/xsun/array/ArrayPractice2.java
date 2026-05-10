package com.xsun.array;

//LeetCode题 合并有序数组
public class ArrayPractice2 {
    static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 4, 4, 4, 5, 6,20};
        int[] nums2 = {-5, -5, -2, -1, 0, 0, 1, 1, 2, 5, 6, 9, 10, 10, 10, 11};
        int[] nums3 = new int[nums1.length + nums2.length];
        int k = 0;
        int j = 0;
        int i = 0;
        for (; i < nums1.length;) {

            for (; j < nums2.length;) {
                if (i==nums1.length) {
                    nums3[k] = nums2[j];
                    k++;
                    j++;
                }
                else if (nums1[i] < nums2[j]) {
                    nums3[k] = nums1[i];
                    k++;
                    i++;


                } else {
                    nums3[k] = nums2[j];
                    k++;
                    j++;
                }
            }
            if(j==nums2.length&&i<nums1.length){
                nums3[k]=nums1[i];
                k++;
                i++;
            }
        }
       /* while (i == nums1.length && j < nums2.length) {
            nums3[k] = nums2[j];
            k++;
            j++;
        }
        while (i < nums1.length && j == nums2.length) {
            nums3[k] = nums1[i];
            k++;
            i++;
        }*/


        System.out.println("合并后的数组：");
        for (
                int l = 0;
                l < nums3.length; l++) {
            if (l > 0) System.out.print("," + nums3[l]);
            else System.out.print(nums3[l]);
        }
    }
}
