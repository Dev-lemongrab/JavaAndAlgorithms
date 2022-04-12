package weeks_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 16505번 : 별
public class Baekjoon_16505 {
    public static char arr[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int len = (int) Math.pow(2, n);
        arr = new char[len][len];
        for (int i = 0; i < len; i++) {
            Arrays.fill(arr[i], ' ');
        }
        rec(0, 0, len);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i; j++) {
                sb.append(arr[i][j]);
            }
            if (i != len - 1)
                sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void rec(int x, int y, int len) {
        if (len == 1) {
            arr[x][y] = '*';
            return;
        }
        int newLen = len / 2;
        rec(x, y, newLen);
        rec(x + newLen, y, newLen);
        rec(x, y + newLen, newLen);
    }
}
