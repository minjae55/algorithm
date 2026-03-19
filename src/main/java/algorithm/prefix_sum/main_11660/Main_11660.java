package algorithm.prefix_sum.main_11660;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_11660 {

    private static int[][] arr;
    private static int[] s;
    private static int n;
    private static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        cnt = Integer.parseInt(st.nextToken());

        s = new int[(n * n) + 1];

        int t = 1;

        st = new StringTokenizer(br.readLine());

        System.out.println("n = " + n);
        System.out.println(s.length);
        while(st.hasMoreTokens()) {
            System.out.println("드러옴");
            for (int i = 1; i <= n; i++) {
                s[i] = s[i - 1] + Integer.parseInt(st.nextToken());
            }
            System.out.println(Arrays.toString(s));
            st = new StringTokenizer(br.readLine());
        }
    }
    //         10
    //12 15 19 24
    //27 31 36 42
}

