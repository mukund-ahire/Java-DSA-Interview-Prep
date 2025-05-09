package Lecture_06.Questions;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ques : Check whether the character is lowercase or uppercase ?
        System.out.print("Enter the word : ");
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("The character "+ ch +" is in lower case");
        }
        if (ch >= 'A' && ch <= 'Z'){
            System.out.println("The character "+ ch +" is in Upper case");
        }

    }
}
