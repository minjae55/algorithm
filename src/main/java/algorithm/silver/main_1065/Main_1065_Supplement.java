package java.algorithm.silver.main_1065;

import java.util.Scanner;

public class Main_1065_Supplement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int standardNum = scanner.nextInt();
        int sequenceQuantity = (standardNum < 100) ? standardNum : 99;

        for (int i = 100; i <= standardNum; i++) {
                int firstPlace = i / 100;
                int secondPlace = (i / 10) % 10;
                int lastPlace = i % 10;

                if((firstPlace -  secondPlace) == (secondPlace - lastPlace))  {
                    sequenceQuantity++;
                }
        }
        System.out.println(sequenceQuantity);
    }

}
