package com.xsun.variable;
//定义数据类型
public class VariableDemo4 {
    static void main(String[] args) {
       /* 1. 字符串 (String)
        2. 字符 (char) 2B
        3. 布尔 (boolean) 理论上1bit，实际通常用1B
        4. 整型 (int/long 等)
        byte             1B
        short           2B
        int            4B
        long          8B
        5. 浮点型 (float/double)
        float              4B
        double             8B
        6. 空 (null)*/
        String name = "mike";
        char sex = '男';
        boolean isMarried = false;
        byte age = 18;
        short height = 170;
        int weight = 80;
        long income = 10000000000000000L;
        float score = 90.5f;
        double grade = 3.14;

        System.out.println( name);
        System.out.println( sex);
        System.out.println( isMarried);
        System.out.println( age);
        System.out.println( height);
        System.out.println( weight);
        System.out.println( income);
        System.out.println( score);
        System.out.println( grade);


    }
}
