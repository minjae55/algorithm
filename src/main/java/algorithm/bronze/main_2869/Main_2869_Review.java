package algorithm.bronze.main_2869;

import java.util.Scanner;

public class Main_2869_Review {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int height = scanner.nextInt();

        int daily = up - down;

        int days = (height - down - 1) / daily + 1;

        System.out.println(days);

    }
}
