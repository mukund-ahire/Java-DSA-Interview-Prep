package Practice_Questions;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            int multi = num * i;
            System.out.println(multi);
        }
    }
}
