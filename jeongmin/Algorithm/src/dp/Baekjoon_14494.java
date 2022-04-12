package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_14494 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      
      long[][] dp = new long[n][m];
      
      for(int i = 0; i < n; i++) {
         for(int j = 0; j < m; j++) {
            dp[i][j] = 1;
         }
      }
      
      for(int i = 1; i < n; i++) {
         for(int j = 1; j < m; j++) {
            dp[i][j] = (dp[i-1][j-1] + dp[i][j-1] + dp[i-1][j]) % 1000000007;
         }
      }
     
      System.out.println(dp[n-1][m-1]);
      
   }
}
