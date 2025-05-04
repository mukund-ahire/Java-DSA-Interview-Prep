package Lecture_05;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Type Casting
//        int num = (int) (65.76f);
//        System.out.println(num);

        // Automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a);
//        System.out.println(b);
//
//        byte c = 20;
//        byte d =40;
//        int e = c + d;
//        System.out.println(e);
//
//        int number = 'A';
//        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " " + (i / c)  + " " + (d * s));
        System.out.println(result);
    }
}
