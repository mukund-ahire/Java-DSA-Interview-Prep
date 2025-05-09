package Lecture_06.Questions;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to reverse : ");
        int num = in.nextInt();
        int reverse = 0;

        while(num >0){
            int remainder = num % 10 ;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

        System.out.println("The reverse number is : " + reverse);
    }
}
