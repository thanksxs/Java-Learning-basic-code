package com.xsun.ifdemo;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入受到伤害：");
        int hurt = sc.nextInt();
        System.out.println("请输入生命恢复");
        int recover = sc.nextInt();
/*        int HP=200;
        if(HP>hurt){
            HP=HP-hurt+recover;
        }
        if (HP<=hurt){
            HP=recover+1;
        }
        System.out.println("剩余生命："+HP);*/
        int HP=200>hurt?200-hurt+recover:recover+1;
        if(HP>200){
            HP=200;
        }
        System.out.println("剩余生命："+HP);
    }
}
