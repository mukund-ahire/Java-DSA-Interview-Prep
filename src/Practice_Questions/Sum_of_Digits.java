package Practice_Questions;

import java.util.Scanner;

public class Sum_of_Digits {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            int sum = 0;

            while (num > 0){
                int remainder = num % 10;
                sum = sum + remainder;
                num = num/10;
            }

            System.out.println(sum);
    }
}

