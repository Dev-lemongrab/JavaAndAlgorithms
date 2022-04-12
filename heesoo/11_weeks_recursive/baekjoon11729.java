import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class baekjoon11729 {
 
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');
 
		Hanoi(N, 1, 2, 3);
		System.out.println(sb);
 
	}
 
	/*
		N : 원판의 개수 
		start : 출발지 
		mid : 옮기기 위해 이동해야 장소 
		to : 목적지
	 */
 
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