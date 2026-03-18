package algorithm.backtracking.main_16198;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_16198 {

    static int result = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<>();

        int q = Integer.parseInt(br.readLine()); // 갯수
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < q; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        getResult(arr, 0);
        System.out.println(result);
    }

    private static void getResult(List<Integer> arr, int sum) {
        if(arr.size() == 2) {
            result = Math.max(sum, result);
            return ;
        }

        for (int i = 1; i < arr.size() - 1; i++) {

            int currentResult = arr.get(i - 1) * arr.get(i + 1);
            int removed = arr.get(i);
            arr.remove(i); //개선

            getResult(arr, (sum + currentResult));

            arr.add(i, removed);
        }
    }
}

