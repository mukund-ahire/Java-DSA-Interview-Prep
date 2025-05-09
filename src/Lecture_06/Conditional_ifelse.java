package Lecture_06;

import java.util.Scanner;

public class Conditional_ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
            Syntax of if statements:
            if ( boolean expression True or False){
                // body
            }else {
                // do this
            }
         */

        System.out.print("Enter the Salary to check the bonus : ");
        int salary = input.nextInt();
        if (salary > 20000){
            salary = salary + 3000;
        } else if(salary > 10000){
            salary = salary + 2000;
        }else {
            salary = salary + 1000;
        }

        System.out.print("Your Salary after bonus is : "+ salary);
    }
}
