import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();	
	static int N, x, y;
	static int[] arr;
	static List<int[]> list;
	public static void main(String[] args) throws IOException {
		N = Integer.parseInt(br.readLine());
		list = new ArrayList<int[]>();
		for(int i=0;i<N;i++) {			
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			arr = new int[2];
			arr[0]=y;arr[1]=x;
			list.add(arr);
		}
		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]<o2[0]) {
					return -1;
				}
				else if(o1[0]==o2[0]) {
					if(o1[1]<o2[1]) {
						return -1;
					}
					else if(o1[1]==o2[1]) {
						return 0;
					}
				}
				return 1;
			};
		});
		for(int[] array : list) {
			sb.append(array[1]).append(" ").append(array[0]).append("\n");
		}
		bw.write(sb.toString());bw.close();br.close();
	}
}
