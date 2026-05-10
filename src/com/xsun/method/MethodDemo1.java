package com.xsun.method;

import java.util.Scanner;

//评委打分问题
public class MethodDemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] scores=new double[5];
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入第" + (i+1) + "个评委的打分（0-100）：");
            double score = sc.nextDouble();
            
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("输入的分数有误，请重新输入");
            }
        }
        double max=getMax(scores);
        double min=getMin(scores);
        System.out.println("最高分："+ max);
        System.out.println("最低分："+ min);
        double sum=0;
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];
        }
        sum-=(max+min);
        System.out.println("去掉最高分和最低分后总分："+ sum);
        System.out.println("去掉最高分和最低分后的平均分："+ sum/3);

    }

    public static double getMax(double[] scores){
        double max=scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i]>max) max=scores[i];
        }
        return max;
    }
    public static double getMin(double[] scores){
        double min=scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i]<min) min=scores[i];
        }
        return min;
    }
}
