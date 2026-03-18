package algorithm.backtracking.main_16198;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_16198_Supplement {

    static int result = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        //키보드 입력을 한 줄 단위로 빠르게 읽음
        List<Integer> arr = new ArrayList<>();

        int n = Integer.parseInt(b.readLine()); // 갯수
        StringTokenizer st = new StringTokenizer(b.readLine());

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(getMaxEnergy(arr,0));
    }

    private static int getMaxEnergy(List<Integer> arr, int sum) {
        if(arr.size() == 2) {
            return sum;
        }

        int max = 0;

        for (int i = 1; i < arr.size() - 1; i++) {
            int energy = arr.get(i - 1) * arr.get(i + 1);
            int removedBead = arr.get(i);
            arr.remove(i);

            max = Math.max(max, getMaxEnergy(arr, sum + energy));

            arr.add(i, removedBead);
        }
        return max;
    }
}

