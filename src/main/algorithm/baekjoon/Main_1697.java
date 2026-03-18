package algorithm.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main_1697 {

    private static int result = 0;
    private static int n = 0;
    private static int k = 0;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        System.out.println("k / n = " + k / n);

        //5 6 7 8 9 10 11 12 13 14 15 16 17
        // 8 9 10 11 12 13 14
        //
        // d
        result = tp();
        k -= (n * result);


        //걷는다면 x-1 또는 x + 1
        //순간이동할경우 2 * x

        //17 / 2 = 10
        // 17 /
        //5 10 9 18 17
        //5 10 15

    }

    private static int tp() {
        int subtractA = k - (n * (k / n));
        int subtractB = (n * ((k / n) + 1)) - k;

        return (subtractA < subtractB ? (k / n) : ((k / n) + 1));
    }
}
