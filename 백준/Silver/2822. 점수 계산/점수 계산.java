import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] arr = new int[8];
		int[] idx_Arr = new int[8];
		for(int i=0;i<8;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			idx_Arr[i]=arr[i];
		}
		Arrays.sort(arr);
		List<Integer> list = new ArrayList<Integer>();
		int sum=arr[7]+arr[6]+arr[5]+arr[4]+arr[3];
		sb.append(sum).append("\n");
		for(int i=0;i<8;i++) {
			if(idx_Arr[i]==arr[7] || idx_Arr[i]==arr[6] || idx_Arr[i]==arr[5]|| idx_Arr[i]==arr[4] ||idx_Arr[i]==arr[3]) {
				list.add(i+1);
			}
		}
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i)).append(" ");
		}
		bw.write(sb.toString());
		bw.close();
		br.close();

		
	}
}
