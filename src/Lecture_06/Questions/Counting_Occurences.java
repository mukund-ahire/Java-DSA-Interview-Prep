package Lecture_06.Questions;

import java.util.Scanner;

public class Counting_Occurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        System.out.print("Enter the digit to find occurence : ");
        int find = in.nextInt();
        int count = 0;

        while (num > 0){
            int remainder = num % 10;
            if (remainder == find){
                count++;
            }
            num = num / 10;
        }
        System.out.println("The digit "+ find + " is occured "+ count + " times.");
    }
}
