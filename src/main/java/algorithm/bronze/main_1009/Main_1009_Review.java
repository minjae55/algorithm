package algorithm.bronze.main_1009;

import java.util.Scanner;

public class Main_1009_Review {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();

        for (int i = 1; i <= counter; i++) {
            int integerA = scanner.nextInt();
            int integerB = scanner.nextInt() % 4;

            int lastDigit = 0;

            if(integerB != 0) {
                lastDigit = (int) Math.pow(integerA, integerB) % 10;
            } else {
                lastDigit = (int) Math.pow(integerA, 4) % 10;
            }

            if (lastDigit == 0) {
                System.out.println(10);
            } else {
                System.out.println(lastDigit);
            }
        }
    }
}
