package com.xsun.method;

import java.util.Scanner;

//班级分数 10名学生（0-100分） 及格率 平均分 最高分
/*成绩键盘录入数组
方法：及格人数->及格率
    总分->平均分
    最高分     */
public class MethodDemo3 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] scores=new int[10];
        for (int i = 0; i < scores.length;) {
            System.out.println("请输入第"+(i+1)+"个学生的成绩"    );
            int score=sc.nextInt();
            if (score>=0 && score<=100) {
                scores[i]=score;
                i++;
            }
            else{
                System.out.println("输入的分数有误，请重新输入");
            }
        }
        System.out.println("分数数组：");
        printArray(scores);
        getPassCountAndRate(scores);
        getSumAndAvg(scores);
        getMax(scores);
    }
    //打印数组
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i>0) System.out.print(","+arr[i]);
            else System.out.print(arr[i]);
        }
        System.out.println();
    }
    //及格人数和及格率
    public static void getPassCountAndRate(int[] scores){
        int count=0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i]>=60) count++;
        }
        System.out.println("及格人数："+ count);
        System.out.println("及格率："+ count*1.0/scores.length);
    }
    //总分和平均分
    public static void getSumAndAvg(int[] scores){
        int sum=0;
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];
        }
        System.out.println("总分："+ sum);
        System.out.println("平均分："+ sum*1.0/scores.length);
    }
    //最高分
    public static void getMax(int[] scores){
        int max=scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i]>max) max=scores[i];
        }
        System.out.println("最高分："+ max);
    }
}
