package weeks_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 11729번 하노이 탑 이동 순서
public class Baekjoon_11729 {
    public static int count;
    public static int n;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        // 규칙 : 작은 원판 위에 큰 원판은 올 수 없다.
        //1. 가장 큰 원판을 C 로 옮기기 위해서는 n-1 개의 원판이 A 에서 B 로 가야한다.
        //2. 그리고 A 에 있는 가장 큰 원판이 C 로 이동할 것이다.
        //3. B 에 있는 (n-1)개의 원판을 C 로 이동한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        sb = new StringBuilder();

        count = (int) (Math.pow(2, n) - 1);
        sb.append(count+"\n");
        honoi(n, 1, 2, 3);
        System.out.println(sb);

    }

    /*
	n : 원판의 개수
	start : 출발지
	mid : 옮기기 위해 이동해야 장소
	to : 목적지
    */
    public static void honoi(int n, int start, int mid, int to) {
        if (n == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }

        // A -> C로 옮긴다고 가정할 떄,
        // STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
        honoi(n - 1, start, to, mid);

        // STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
          sb.append(start + " " + to + "\n");

        // STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
        honoi(n - 1, mid, start, to);
    }
}
