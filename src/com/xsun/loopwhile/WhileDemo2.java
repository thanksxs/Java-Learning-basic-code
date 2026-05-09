package com.xsun.loopwhile;

public class WhileDemo2 {
    //珠穆朗玛峰高8848.86m=8848860mm.如果一张0.1mm的纸，需要对折多少次才能
    //折出珠穆朗玛峰的高度
    static void main(String[] args) {
        double hight = 8848860;
        int count = 0;
        double paper = 0.1;
        while(paper < hight){
            paper *= 2;
            count++;
        }
        System.out.println("需要折叠"+count+"次");
    }
}
