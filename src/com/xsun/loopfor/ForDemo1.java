package com.xsun.loopfor;

public class ForDemo1 {
    static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
        for(int i=5;i>=1;i--){
            System.out.println(i);
        }
        //求1-5的和
        for (int i =1;i<=5;i++){
            int sum =0;
            sum += i;
            if (i==5) System.out.println("1-5的和为："+ sum);
        }
        //求1-100间偶数的和
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0) sum += i;
        }
        System.out.println("1-100间偶数的和为："+ sum);

    }
}
