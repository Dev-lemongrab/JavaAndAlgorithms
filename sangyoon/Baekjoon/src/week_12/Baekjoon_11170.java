package week_12;

import java.util.*;
 
public class Baekjoon_11170{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
 
            int cnt = 0;
 
            for (int j = N; j <= M; j++) {
                int t = j;
                if (t == 0) {
                    cnt++;
                    continue;
                }
 
                while (t > 1) {
                    if (t % 10 == 0) {
                        cnt++;
                    }
                    t /= 10;
                }
 
            }
            System.out.println(cnt);
 
        }
        sc.close();
 
    }
}
