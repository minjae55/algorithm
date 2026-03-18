package algorithm.backtracking.main_1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1026_Review {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int capacity = Integer.parseInt(br.readLine().trim());

        int[] arrA = new int[capacity];
        int[] arrB = new int[capacity];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < capacity; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < capacity; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int multiplySum = 0;
        for (int i = 0; i < capacity; i++) {
            multiplySum += arrA[i] * arrB[capacity - 1 - i];
        }

        System.out.println(multiplySum);
    }
}
