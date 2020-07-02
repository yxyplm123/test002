package com.zhiwei;

public class Test {
    public static void main(String[] args) {
        System.out.println("你好，第一次提交代码");
        System.out.println("第二次提交代码");
        System.out.println("第四次提交");
        System.out.println("第五次提交");
        System.out.println("123456");
        System.out.println("你好阿，北京");
        System.out.println("我晓得了");

         String  a = "012";
        String substring = a.substring(1);
        String month = substring.concat("月");
        System.out.println(month);
        String space = month.substring(0, month.lastIndexOf("月"));
        System.out.println(space);
        int b = 5;
        if(b ==7 ){
            System.out.println("flase");
        }else {
            System.out.println("true");
        }
    }
}
