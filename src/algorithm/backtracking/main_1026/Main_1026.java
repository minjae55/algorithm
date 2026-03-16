package algorithm.backtracking.main_1026;

import java.util.*;
public class Main_1026{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        scanner.nextLine();

        List<Integer> arrA = new ArrayList<>();
        List<Integer> arrB = new ArrayList<>();

        for (int i = 0; i < capacity; i++) {
            int number = scanner.nextInt();
            arrA.add(number);
        }

        for (int i = 0; i < capacity; i++) {
            int number = scanner.nextInt();
            arrB.add(number);
        }

        int multiplySum = 0;

        List<Integer> sortArrB = new ArrayList<>(arrB);
        Collections.sort(arrA);
        Collections.sort(sortArrB, (i1, i2) -> i2 - i1);

        for (int i = 0; i < arrA.size(); i++) {
            multiplySum += arrA.get(i) * sortArrB.get(i);
        }

        System.out.println(multiplySum);
    }
}
