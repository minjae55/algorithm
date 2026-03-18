package algorithm.bronze.main_1009;

import java.util.Scanner;

public class Main_1009 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        for (int i = 0; i < counter; i++) {

            int integerA = scanner.nextInt() % 10;
            int integerB = scanner.nextInt();

            int exponent = integerB % 4;

            if (exponent == 0) {
                exponent = 4;
            }

            int result = (int) Math.pow(integerA, exponent) % 10;

            if (result == 0) {
                System.out.println(10);
            } else {
                System.out.println(result);
            }
        }
    }
}
