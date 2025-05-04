package Lecture_05;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.print("Enter the Celsius temp to convert : ");
        float tempC = input.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println("The temp in Fahrenheit is : "+ tempF);
    }
}
