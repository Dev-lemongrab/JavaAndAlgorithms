package week_11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj11729 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        sb.append((int) (Math.pow(2, N) - 1)).append('\n');//하노이탑 이동 횟수 = 2의n승 - 1
        Hanoi(N, 1, 2, 3);
        System.out.println(sb);
    }
    public static void Hanoi(int N, int start, int mid, int to) {
        if (N == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }
        Hanoi(N - 1, start, to, mid);
        sb.append(start + " " + to + "\n");
        Hanoi(N - 1, mid, start, to);
    }
}