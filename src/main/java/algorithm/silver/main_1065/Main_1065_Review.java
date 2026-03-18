package java.algorithm.silver.main_1065;

import java.util.Scanner;

public class Main_1065_Review {

    public static boolean isHansu(int num) {

        if (num < 100) return true;

        int prev = num % 10; //3
        num /= 10;  //12
        int diff = (num % 10) - prev;

        while(num >= 10) {
            prev = num % 10;
            num /= 10;

            if((num % 10) - prev != diff) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (isHansu(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
