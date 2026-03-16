package algorithm.backtracking.main_25501;

import java.util.Scanner;

public class Main_25501 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[t];

        for (int i = 0; i < arr.length; i++) {
            String s = scanner.nextLine();
            isPalindrome(s);
        }
    }

    public static int recursion(String s, int l, int r, int cnt) {
        cnt++;
        if (l >= r) {
            System.out.println(1 + " " + cnt);
            return 1;
        }
        else if(s.charAt(l) != s.charAt(r)) {
            System.out.println(0 + " " + cnt);
            return 0;
        }
        else {
            return recursion(s, l + 1, r - 1, cnt);
        }
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0 , s.length() - 1, 0);
    }
}
