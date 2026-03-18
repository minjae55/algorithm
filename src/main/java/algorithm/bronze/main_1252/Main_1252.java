package algorithm.bronze.main_1252;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_1252 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstStr = scanner.next();
        String secondStr = scanner.next();

        BigInteger firstNum = new BigInteger(firstStr, 2);
        BigInteger secondNum = new BigInteger(secondStr, 2);
        BigInteger sum = firstNum.add(secondNum);

        System.out.println(sum.toString(2));
    }
}
