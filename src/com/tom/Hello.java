package com.tom;

public class Hello {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("com.tom.Hello World!");

        //Scope
        {
            int i = 10;
        }

        {
            int j = 2;
            System.out.println(j);
        }

        //成年
        int age = 21;
        boolean adult = true;
        System.out.println(age > 18);

        //n>2
        int n = 2;
        boolean result = n>2;
        System.out.println(result);

        //-3 <= result <=2
        result = n >= -3 && n <= 2;
        System.out.println(result);
        if(result) {
            System.out.println("Good!");
        }else {
            System.out.println("Bad");
        }
    }
}
