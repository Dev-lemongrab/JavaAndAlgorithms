package weeks_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11170 {
	static StringBuilder sb = new StringBuilder();
	static int count = 0;
	public static void main(String[] args) {
		BufferedReader br = null;
		StringTokenizer stz;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			for(int i = 0; i < testcase; i++) {
				stz = new StringTokenizer(br.readLine());
				solution(stz.nextToken(), stz.nextToken());
				sb.append(count).append('\n');
				count = 0;
			}
			System.out.println(sb);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	public static void solution(String a, String b) {
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == '0') count++;
		}
		if(a.equals(b)) return;
		int k = Integer.parseInt(a) + 1;
		solution(String.valueOf(k), b);
	}
}
