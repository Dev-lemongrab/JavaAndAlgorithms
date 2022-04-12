package week_11;

import java.util.*;
import java.io.*;
public class bj5568{
    static int n;
    static String card[];
    static boolean visited[];
    static HashSet<String> hs = new HashSet<String>();
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        card = new String [n];
        for(int i = 0; i< n; i++) {
            card[i] = br.readLine();
        }
        visited = new boolean [n];
        selectCard(k, "");
        sb.append(hs.size());
        System.out.println(sb);
    }
    public static void selectCard(int remain, String k) {
        if(remain == 0) {
            hs.add(k);
            return;
        }
        for(int i = 0; i< n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                selectCard(remain-1, k + card[i]);
                visited[i] = false;
            }
        }
    }
}