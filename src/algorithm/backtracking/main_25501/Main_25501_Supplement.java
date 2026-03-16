package algorithm.backtracking.main_25501;

import java.util.Scanner;

public class Main_25501_Supplement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            Result result = isPalindrome(s);
            System.out.println(result.isPalindrome ? 1 : 0 +  " " + result.count);
        }
    }

    //결과를 담을 객체
    static class Result {
        boolean isPalindrome;
        int count;

        public Result(boolean isPalindrome, int count) {
            this.isPalindrome = isPalindrome;
            this.count = count;
        }
    }

    public static Result recursion(String s, int l, int r, int cnt) {
        cnt++;
        if (l >= r) {
            return new Result(true, cnt);
        }
        else if(s.charAt(l) != s.charAt(r)) {
            return new Result(false, cnt);
        }
        return recursion(s, l + 1, r - 1, cnt);
    }

    public static Result isPalindrome(String s) {
        return recursion(s, 0 , s.length() - 1, 0);
    }
}
