package algorithm.backtracking.main_18511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_18511 {

    private static int n;
    private static int q;
    private static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());
        arr = new int[q];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < q; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        recursion(0);
    }

    private static void recursion(int current) {
        int c = 0;
        if(n < c) { //최대 수를 넘어가면 return
            System.out.println(" return ");
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            c = 10 * current + arr[i];
            System.out.println("c = " + c);
            recursion( 10 * current + arr[i]); // 11 112

        }
        //657 3
        //1 5 7
        // 1 * 10 = 1
        // 1 * 10 = 10
        // 1 * 100 = 100
    }
}
