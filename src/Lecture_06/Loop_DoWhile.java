package Lecture_06;

import java.util.Scanner;

public class Loop_DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // will run once.

        /*
            Syntax for do_while loop :
            do {
                // body statements
            } while(condition);
         */

        // Ques : Print the numbers from 1 to 5;
        int num = 1;
        do{
            System.out.print(num + " ");
            num++ ;
        } while (num <= 5);
    }
}
