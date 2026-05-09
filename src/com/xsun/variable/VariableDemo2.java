package com.xsun.variable;

public class VariableDemo2 {
    static void main(String[] args) {
/*  我方：叉子   对方：长手
    攻击：220攻击：210
    防御：85防御：80
    血量：1012.5血量：1223.3
    技能加成：1.2技能加成：1.3

    技能造成伤害的公式：攻击力*技能加成-对方防御力
    普攻造成伤害的公式：攻击力-对方防御力

    计算：我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
    我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？*/

        int Attack1 = 220;
        int Defense1 = 85;
        double health1 = 1012.5;
        double skillAdd1 = 1.2;

        int Attack2 = 210;
        int Defense2 = 80;
        double health2 = 1223.3;
        double skillAdd2 = 1.3;


        //第一次普通攻击造成的伤害：
        double damage1 = Attack1 - Defense2;
        //第一次普通攻击后剩余血量：
        health2 = health2 - damage1;

        System.out.println("第一次普通攻击造成伤害：" + damage1 + "，对方剩余血量：" + health2);

        //第二次技能攻击造成的伤害：
        double damage2 = Attack1 * skillAdd1 - Defense2;
        //第二次技能攻击后剩余血量：
        health2 = health2 - damage2;

        System.out.println("第二次技能攻击造成伤害：" + damage2 + "，对方剩余血量：" + health2);
    }
}
