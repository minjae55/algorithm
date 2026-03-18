package algorithm.backtracking.main_16198;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_16198_Review {

    static int n;
    static int[] beads;
    static boolean[] vistied;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        beads = new int[n];
        vistied = new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            beads[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);
        System.out.println(result);
    }

    private static void dfs(int depth, int sum) {
        // depth = 현재 제거한 구슬의 개수
        //양 끝 2개만 남은 상태
        if (depth == n - 2) {
            result = Math.max(result, sum);
            return;
        }

        for (int i = 0; i < n; i++) {
            //양 끝이 제거된 구슬은 스킵
            if(i == 0 || i == n - 1 || vistied[i]) continue;

            //visted 기준으로 현재 i의 실제 좌우 찾기
            int left = getLeft(i);
            int right = getRight(i);

            if (left == - 1 || right == -1) continue;

            int energy = beads[left] * beads[right];

            vistied[i] = true;

            dfs(depth + 1, sum + energy);

            vistied[i] = false;
        }

    }

    private static int getLeft(int i) {
        for (int j = i + 1; j < n; j++) {
            if (!vistied[j]) return j;
        }
        return -1;
    }

    private static int getRight(int i) {
        for (int j = i - 1; j >= 0; j--) {
            if(!vistied[j]) return j;
        }
        return -1;
    }
}
