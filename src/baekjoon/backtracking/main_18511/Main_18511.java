package baekjoon.backtracking.main_18511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_18511 {

    private static int result = 0;
    private static int s = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());

        String n = st.nextToken();
        s = Integer.parseInt(n);

        String q = st.nextToken();

        st = new StringTokenizer(br.readLine());
        List<String> arr = new ArrayList<>();

        while(st.hasMoreTokens()) {
            arr.add(st.nextToken());
        }

        recursion(arr, "", 0);

    }

    private static void recursion(List<String> arr, String a, int currentResult) {
        if(arr.size() == 0) {
            a = "";
            return;
        }
        //657 3
        //1 5 7

        for (int i = 0; i < arr.size(); i++) {
            String next = a + arr.get(i);
            System.out.println("a = " + a);
            System.out.println("next = " + next);

            String removed = arr.get(i);
            int removedIndex = i;
            arr.remove(removedIndex);
            System.out.println("지우기 전 arr = " + arr);
            recursion(arr, a, currentResult);
            arr.add(removedIndex, removed);
            System.out.println("추가 후  arr = " + arr);
        }
//
//        for (int i = 0; i < arr.size(); i++) {
//            a += arr.get(i);
//
//            String removed = arr.get(i);
//            int removedIndex = i;
//            arr.remove(removedIndex);
//            recursion(arr, a, currentResult);
//            arr.add(removedIndex, removed);
//        }

    }

}
