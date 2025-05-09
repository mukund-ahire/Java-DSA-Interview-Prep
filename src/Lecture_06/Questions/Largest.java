package Lecture_06.Questions;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ques : Find the largest number from three numbers ?

        System.out.print("Enter the three digits : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int largest = a;
//
//        if (b > largest) {
//            largest = b;
//            if (c > largest) {
//                largest = c;
//            }
//        }

        int max = Math.max(c, Math.max(a,b));
        System.out.print("The largest number among three numbers is : " + max);
    }
}
