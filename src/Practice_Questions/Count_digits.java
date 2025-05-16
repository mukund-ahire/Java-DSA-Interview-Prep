package Practice_Questions;

import java.util.Scanner;

public class Count_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;

        while (num > 0) {
            int remainder = num % 10;
            num = num / 10;
            count++;
        }

        System.out.println(count);
    }
}
