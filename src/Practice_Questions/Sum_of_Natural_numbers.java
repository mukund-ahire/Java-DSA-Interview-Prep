package Practice_Questions;

import java.util.Scanner;

public class Sum_of_Natural_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;

        for (int i = 1; i <= num ; i++) {
            count = count + i;
        }

        System.out.println(count);
    }
}
