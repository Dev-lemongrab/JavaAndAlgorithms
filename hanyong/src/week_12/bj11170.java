package week_12;
import java.io.*;
import java.util.StringTokenizer;

public class bj11170 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int cnt = 0;
            st = new StringTokenizer(br.readLine(), " ");
            int min = Integer.parseInt(st.nextToken());
            int max = Integer.parseInt(st.nextToken());
            for (int j = min; j <= max; j++) {
                cnt += calc(j);
            }
            System.out.println(cnt);

        }
    }
    static int calc(int num) {
        int cnt = 0;
        for (int i = 0; i < String.valueOf(num).toCharArray().length; i++) {
            if (String.valueOf(num).toCharArray()[i] == '0') {
                cnt++;
            }
        }
        return cnt;
    }
}
