package Lecture_06;

import java.util.Scanner;

public class Loop_For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
            Syntax of for loops:
            for (intialization; condition; increment or decrement){
                // body of statements
            }
         */

        // Ques : Print the numbers from 1 to 5 ?

        for(int num = 1; num <= 5; num++){
            System.out.print(num + " ");
        }

        System.out.println( );

        // Ques : Print the numbers from 1 to n ?
        System.out.print("Enter the nth number : ");
        int num1 = input.nextInt();

        for (int i = 1; i <= num1; i++) {
            System.out.print(i + " ");
        }
    }
}
