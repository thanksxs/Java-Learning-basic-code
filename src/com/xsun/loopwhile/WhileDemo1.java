package com.xsun.loopwhile;

public class WhileDemo1 {
    static void main(String[] args) {
        //银行存入100000元，复利1.7%，多少年后实现本金翻倍
        double money = 100000;
        int year = 0;
        while (money < 200000){
            money = money * 1.017;
            year+=1;
        }
        System.out.println("实现本金翻倍需要"+year+"年后");
    }
}
