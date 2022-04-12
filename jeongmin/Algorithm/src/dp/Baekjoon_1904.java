package dp;

import java.io.*;

public class Baekjoon_1904 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n + 1];	
		dp[0] = 0;
    
		for(int i = 1; i < dp.length; i++) {
			if(i == 1) dp[i] = 1;
			else if(i == 2) dp[i] = 2;
			else dp[i] = (dp[i - 2] + dp[i - 1]) % 15476;
		}
		
		System.out.println(dp[n]);
	}
}
