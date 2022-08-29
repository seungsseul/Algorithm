import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][2];
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for(int t=0;t<N;t++) {
			st=new StringTokenizer(br.readLine());
			String age = st.nextToken();
			String name = st.nextToken();
			arr[t][0]=age;
			arr[t][1]=name;
		}
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if(o1[0]==o2[0]) {
					return 1;
				}
				else {					
					return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
				}
			}
		});
		for(int i=0;i<N;i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}