package weeks_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon11729 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int testcase = Integer.parseInt(br.readLine());
			sb.append((int)(Math.pow(2, testcase)-1)).append('\n');
			solution(testcase, 1, 2, 3);
			System.out.println(sb);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	public static void solution(int testcase ,int one, int two, int thr) {
		if(testcase == 1) {
			sb.append(one+ " "+thr+"\n");
			return;
		}
		solution(testcase-1, one, thr, two); // one > two
		sb.append(one+" "+thr+"\n"); // one > three
		solution(testcase-1, two, one, thr); // two > three
	}
}
