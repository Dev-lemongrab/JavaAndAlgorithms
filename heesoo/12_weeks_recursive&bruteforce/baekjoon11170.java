import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11170 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int cnt = m - n + 1;
			
			recursive(n, m);
		}
		System.out.println(sb);
	}
	static String[] arr;
	static void recursive(int n, int m) {
		
		int cnt = m - n +1;
		int result =0;
		
		arr = new String[cnt];
		for (int i = 0; i < cnt; i++) {
			arr[i] = Integer.toString(n);
			result+=recursiveArr(i);
			n++;
		}
		sb.append(Integer.toString(result)+"\n");
		
	}
	static int recursiveArr(int n) {
		int count = 0;
		for (int i = 0; i < arr[n].length(); i++) {
			if(arr[n].charAt(i) == '0') {
				count++;
			}
		}
		
		return count;
	}
}
