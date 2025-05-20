package Lecture_06_1;

import java.util.Scanner;

public class Switch_Statements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        Syntax for the Switch Statement :
        switch (expression) {
            case one:
                    block of code ;
            case two:
                    block of code ;
            default :
                    block of code :
        }
         */
        System.out.print("Enter the fruit name : ");
        String fruit =in.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of the fruits.");
            case "Apple" -> System.out.println("A Sweet Red Fruit.");
            default -> System.out.println("Invalid");
        }
    }
}
