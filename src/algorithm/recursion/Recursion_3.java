package algorithm.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Recursion_3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int q = Integer.parseInt(st.nextToken());
        int[] arr = new int[q];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < q; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = recursion(arr, 0);

        System.out.println(result);
    }

    private static int recursion(int[] arr, int i) {
        if (i == arr.length) return 0;

        return arr[i] + recursion(arr, i + 1);
    }
}
