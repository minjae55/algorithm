package java.algorithm.silver.main_1268;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_1268 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int studentQuantity = scanner.nextInt();
        scanner.nextLine();
        List<Integer>[] studentClassList = new ArrayList[studentQuantity + 1];
        int[] studentNum = new int[studentQuantity + 1];

        for (int i = 1; i < studentQuantity + 1; i++) {
            String studentClass = scanner.nextLine();
            studentClassList[i] = new ArrayList<>();
            String[] splitClass = studentClass.split(" ");

            for (int j = 0; j < splitClass.length; j++) {
                studentClassList[i].add(Integer.valueOf(splitClass[j]));
            }
        }

        for (int i = 1; i < studentClassList.length; i++) { //비교 학생 A
            for (int j = 1; j < studentClassList.length; j++) { // 비교 학생 B
                if(i == j) continue;

                for (int k = 0; k < 5; k++) { //반
                    if(studentClassList[i].get(k).equals
                            (studentClassList[j].get(k))) {
                        studentNum[i]++;
                        break;
                    }
                }
            }
        }
        int maxSum = 0;
        int num = 0;
        for (int i = 1; i < studentNum.length; i++) {
            if(i == 1) {
                maxSum = studentNum[i];
                num = i;
            }
            if(maxSum < studentNum[i]) {
                maxSum = studentNum[i];
                num = i;
            } else if(maxSum == studentNum[i]) {
                if(num > i) {
                    num = i;
                    maxSum = studentNum[i];
                }
            }
        }
        System.out.println(num);
    }
}