import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static List<String> list;
	static String[][] arr;
	static String Input, tmp;
	static int R, C;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		arr = new String[R][C];
		list = new ArrayList<>();
		for(int i=0;i<R;i++) {
			Input = br.readLine();
			for(int j=0;j<C;j++) {
				arr[i][j]=String.valueOf(Input.charAt(j));
			}
		}
		for(int i=0;i<R;i++) {
			tmp="";
			for(int j=0;j<C;j++) {
				if(arr[i][j].equals("#") && (tmp.length()==1 || tmp.equals(""))) {
					tmp="";
					continue;
				}
				else if(arr[i][j].equals("#") && tmp.length()>1) {
					break;
				}
				tmp+=arr[i][j];
			}
			if(tmp.length()>1) {				
				list.add(tmp);
			}
		}
		for(int j=0;j<C;j++) {
			tmp="";
			for(int i=0;i<R;i++) {
				if(arr[i][j].equals("#") && (tmp.length()==1 || tmp.equals(""))) {
					tmp="";
					continue;
				}
				else if(arr[i][j].equals("#") && tmp.length()>1) {
					break;
				}
				tmp+=arr[i][j];
			}
			if(tmp.length()>1) {				
				list.add(tmp);
			}
		}
		Collections.sort(list);
		bw.write(list.get(0));
		bw.flush();bw.close();br.close();
	}
}
