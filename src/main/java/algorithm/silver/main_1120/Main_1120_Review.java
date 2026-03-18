package java.algorithm.silver.main_1120;

import java.util.Scanner;

public class Main_1120_Review {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String small = scanner.next();
        String large = scanner.next();

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= large.length() - small.length(); i++) {
            int diffCount = 0;

            for (int j = 0; j < small.length(); j++) {
                if(small.charAt(j) != large.charAt(i + j)) {
                    diffCount++;
                }
                if (diffCount >= minDiff) break;
            }
            minDiff = Math.min(minDiff, diffCount);
        }
        System.out.println(minDiff);
    }
}
