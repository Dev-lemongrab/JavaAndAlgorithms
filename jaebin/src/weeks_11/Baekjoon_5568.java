package weeks_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

//백준 알고리즘 5568번 :  카드 놓기
public class Baekjoon_5568 {
    public static HashSet<String> hs;
    public static int arr[];
    public static boolean visited[];
    public static int n;
    public static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        arr = new int[n];
        visited = new boolean[n];
        hs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        StringBuilder sb = new StringBuilder();
        rec(0, sb);
        System.out.println(hs.size());
    }

    public static void rec(int depth, StringBuilder sb) {
        if (depth == k) {
            hs.add(sb.toString());
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                int len = String.valueOf(arr[i]).length();
                rec(depth + 1, sb.append(arr[i]));
                //시작 <= 범위 < 끝
                sb.delete(sb.length()-len,sb.length());
                visited[i] = false;
            }
        }
    }
}
