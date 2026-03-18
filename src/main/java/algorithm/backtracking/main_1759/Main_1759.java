package algorithm.backtracking.main_1759;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_1759 {

    private static int l = 0;
    private static int c = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //서로 다른 L개의 알파벳 소문자들로 구성
        // 최소 한 개의 모음과 최소 두 개의 자음

        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        List<String> arr = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            arr.add(st.nextToken());
        }

        Collections.sort(arr);
        recursion(arr, "");
    }

    private static void recursion(List<String> arr, String s) {
        if(s.length() == l) {
            System.out.println("종료 조건문 s = " + s);
            s = "";
            return;
        }

        for (int i = 0; i < arr.size(); i++) {
            if(s.contains(arr.get(i))) continue;
            String removed = arr.get(i);
            s += removed;
            System.out.println("removed = " + removed);
            System.out.println("s = " + s);

            arr.remove(i);
            System.out.println("지운 뒤 arr = " + arr);
            // t w
            recursion(arr, s);
            arr.add(removed); // a c i s
            System.out.println("추가 후 arr = " + arr);
        }

    }
}
