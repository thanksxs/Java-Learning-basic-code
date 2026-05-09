package com.xsun.operator;
/*不同数据类型运算
1.隐式转换：(java默认取值范围小的数据类型转换成取值范围大的数据类型)
            比如，有byte或short的运算时，都会先转换成int，再进行运算
2.强制转换：(取值范围大的数据类型转换成取值范围小的数据类型),不会自动触发，容易造成数据损失*/
public class OperatorDemo4 {
    static void main(String[] args) {

        byte a = 127;
        byte b = 127;
        short c = (short) (a + b);
        System.out.println(c);
    }
}
