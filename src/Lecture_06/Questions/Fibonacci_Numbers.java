package Lecture_06.Questions;

import java.util.Scanner;

public class Fibonacci_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ques : find the nth fibonacci number ?
        System.out.print("Enter the starting two numbers : ");
        int initial = in.nextInt();
        int next = in.nextInt();
        int count = 2;

        System.out.print("Enter the nth number to find : ");
        int num3 = in.nextInt();

        while (count <= num3){
            int temp = next;
            next = next + initial;
            initial = temp;
            count++ ;
        }

        System.out.println(next);
    }
}
