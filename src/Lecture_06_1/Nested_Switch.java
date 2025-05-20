package Lecture_06_1;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Employee Id : ");
        int empID = in.nextInt();
        System.out.print("Enter the Department : ");
        String department = in.next();

        switch (empID) {
            case 1 -> {
                System.out.println("Mukund Ahire");
                switch (department) {
                    case "IT" -> System.out.println("Desk 1");
                    case "Management" -> System.out.println("Desk 1");
                    default -> System.out.println("Invalid department");
                }
            }
            case 2 -> {
                System.out.println("Parth Ahire");
                switch (department) {
                    case "IT" -> System.out.println("Desk 2");
                    case "Management" -> System.out.println("Desk 2");
                    default -> System.out.println("Invalid department");
                }
            }
            case 3 -> {
                System.out.println("Narendra Ahire");
                switch (department) {
                    case "IT" -> System.out.println("Desk 3");
                    case "Management" -> System.out.println("Desk 3");
                    default -> System.out.println("Invalid department");
                }
            }
            default -> System.out.println("Enter valid details.");
        }
    }
}
