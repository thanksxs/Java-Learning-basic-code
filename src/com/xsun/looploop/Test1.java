package com.xsun.looploop;
//菱形
public class Test1 {
    static void main(String[] args) {
        //打印图形
        for (int i = 0; i < 4; i++) {
            for (int j=i; j < 3; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <2*i+1; j++){
                System.out.print("*");
            }
//            for (int j = i; j < 7; j++)
            System.out.println();
        }
        for(int i=0;i<3;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<5-2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
