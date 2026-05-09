package com.xsun.variable;

public class VariableDemo5 {
    static void main(String[] args) {
        //计算BMI：BMI=体重（kg）/身高^2
        double weight=54;
        double height=1.75;

        double BMI=weight/(height*height);

        System.out.println("BMI="+BMI);

        //计算体重：max_weight=max_BMI*height^2
        double max_BMI=23.99;
        double max_weight=max_BMI*height*height;

        System.out.println("标准BMI下体重最高为："+max_weight);
    }
}
