package algorithm.backtracking.main_25501;

import java.util.Scanner;

public class Main_25501_Review {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            int count = 0;
            boolean isPalin  = true;

            int l = 0, r = s.length() - 1;

            while(l <= r) {
                count++;
                if (s.charAt(l) != s.charAt(r)) {
                    isPalin = false;
                    break;
                }
                l++;
                r--;
            }

            System.out.println((isPalin ? 1 : 0) + " " + count);
            
        }
    }
}
