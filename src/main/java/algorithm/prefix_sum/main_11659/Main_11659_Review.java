package baekjoon_example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_11659_Review {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int cnt = Integer.parseInt(st.nextToken());
		int[] s = new int[n + 1];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			s[i] = s[i - 1] + Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int end= Integer.parseInt(st.nextToken());
			sb.append(s[end] - s[first - 1]).append("\n");
		}
		
		bw.close();
		
	}

}
