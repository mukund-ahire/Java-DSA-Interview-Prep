package Practice_Questions;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int reverse = 0;

        while (num > 0){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }

        System.out.println(reverse);
    }
}
