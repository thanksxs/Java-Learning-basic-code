package com.xsun.loopfor;

public class ForDemo3 {
    static void main(String[] args) {
        //0,1,1,2,3,5,8,13,21,34,55,89,
        int a = 0;
        int b =1 ;
        int c;
        for(int i=1;i<=10;i++){
            if (i==1) continue;
            else{
                c=b;
                b+=a;
                a=c;
            }
        }
        System.out.println("第十项为："+a);
    }
}
