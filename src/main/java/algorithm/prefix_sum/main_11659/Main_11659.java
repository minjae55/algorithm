package baekjoon_example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_11659 {
	
	static private int n;
	static private int cnt;
	static private int arr[];
	static private int s[];

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		cnt = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		s = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		//5 4 3 2 1 
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(i == 0) {
				s[i] = arr[i]; 
			} else {
				s[i] = s[i - 1] + arr[i]; 
			}
		}

		for (int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			rangeSum(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		
	}

	private static void rangeSum(int first, int end) {
		
		first -= 1;
		end -= 1;
		int result = 0;
		
		if(first <= 0 ) {
			result = s[end];
		} else {
			result = s[end] - s[first - 1]; 
		}
		
		System.out.println(result);
		
	}

}
