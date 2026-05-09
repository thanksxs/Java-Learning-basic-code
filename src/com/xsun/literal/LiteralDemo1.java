package com.xsun.literal;

/* Java 中一共有六种字面量：
   1. 字符串 (String)                  字面量：使用双引号包裹，例如 "hello"
   2. 字符 (char) 2B                          字面量：使用单引号包裹，例如 'A'（注意：原理解中误写为双引号或单引号，字符只能用单引号）
   3. 布尔 (boolean) 理论上1bit，实际通常用1B      字面量：只有 true 和 false
   4. 整型 (int/long 等)               字面量：直接输入数字，例如 100
           byte             1B
            short           2B
             int            4B
              long          8B

   5. 浮点型 (float/double)            字面量：包含小数点的数字，例如 3.14
        float              4B
          double             8B
   6. 空 (null)                      字面量：表示空引用，写作 null
*/
public class LiteralDemo1 {
    //输出恐龙的信息：霸王龙 8岁 11.5 公
    void main(String[] args){
        //恐龙的名字：霸王龙
        System.out.println("霸王龙");
        //年龄：8岁
        System.out.println(8);
        //体重：11.5
        System.out.println(11.5);
        //性别：公
        System.out.println("公");
    }

}
