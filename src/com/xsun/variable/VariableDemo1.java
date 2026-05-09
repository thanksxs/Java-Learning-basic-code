package com.xsun.variable;

public class VariableDemo1 {
    static void main(String[] args) {
    /*微信余额：0元
    支付宝余额：10元
    银行卡余额：20元
    问题一：请问现在一共有多少钱？
    问题二：微信收了10元红包，又发了2元红包，余额多少？*/
        double wechat = 0;
        double alipay = 10;
        double bank = 20;
        double total = wechat + alipay + bank;
        System.out.println("现在一共有" + total + "元");
        wechat = wechat + 10 - 2;
        System.out.println("微信余额" + wechat + "元");
    }
}
