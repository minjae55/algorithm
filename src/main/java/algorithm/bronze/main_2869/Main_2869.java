package algorithm.bronze.main_2869;

import java.util.Scanner;

public class Main_2869 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int goalHeigt = scanner.nextInt();

        int result = 0;
        int realMove = up - down; // 4
        int realGoal = goalHeigt - up;

        result = (realGoal + realMove - 1) / realMove; // 3
        result++;
        System.out.println(result);
    }
}
