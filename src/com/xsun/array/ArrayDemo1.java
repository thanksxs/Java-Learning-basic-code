package com.xsun.array;

public class ArrayDemo1     {
    static void main(String[] args) {
        int[] height = {154,176,180};
        int[] age = {18,19,21};
        double[] weight = {56.2,60.4,55,9};
        String[] names = {"张三","李四","王五"};

        names[0]="Jack";
        names[1]="Tom";
        names[2]="Mike";
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]+"身高"+height[i]+"cm,"+"年龄"+age[i]+"岁,"+"体重"+weight[i]+"kg");
        }
        System.out.println(names.length);

    }
}
