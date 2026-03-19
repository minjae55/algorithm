package baekjoon_example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_11659_Supple {
	
	static private int n;
	static private int cnt;
	static private int arr[];
	static private int s[];
	static private BufferedWriter bw;
;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		cnt = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		s = new int[n + 1];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			s[i] = s[i - 1] + Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			rangeSum(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		bw.close();
		
	}

	private static void rangeSum(int first, int end) throws IOException {
		bw.write(s[end] - s[first - 1] + "\n");
	}

}
