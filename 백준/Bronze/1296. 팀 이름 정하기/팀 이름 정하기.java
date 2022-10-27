import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int N, L, O, V, E, l, o, v, e, max;
	static String Yeondu, teamName, ans;
	static String[] teamArr, Sort;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		Yeondu = br.readLine();
		l=0;o=0;v=0;e=0;
		for(int i=0;i<Yeondu.length();i++) {
			if(String.valueOf(Yeondu.charAt(i)).equals("L")) {
				l++;
			}
			else if(String.valueOf(Yeondu.charAt(i)).equals("O")) {
				o++;
			}
			else if(String.valueOf(Yeondu.charAt(i)).equals("V")) {
				v++;		
			}
			else if(String.valueOf(Yeondu.charAt(i)).equals("E")) {
				e++;
			}
		}
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		teamArr = new String[N];
		for(int t=0;t<N;t++) {
			L=0;O=0;V=0;E=0;
			L+=l;O+=o;V+=v;E+=e;
			teamName = br.readLine();
			teamArr[t]=teamName;
			for(int i=0;i<teamName.length();i++) {
				if(String.valueOf(teamName.charAt(i)).equals("L")) {
					L++;
				}
				else if(String.valueOf(teamName.charAt(i)).equals("O")) {
					O++;
				}
				else if(String.valueOf(teamName.charAt(i)).equals("V")) {
					V++;		
				}
				else if(String.valueOf(teamName.charAt(i)).equals("E")) {
					E++;
				}
			}
			arr[t]=((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100;
		}
		max=-1;
		ans="";
		for(int i=0;i<N;i++) {
			if(max<=arr[i]) {
				if(max==arr[i]) {
					Sort = new String[2];
					Sort[0]=ans;
					Sort[1]=teamArr[i];
					Arrays.sort(Sort);
					max=arr[i];
					ans=Sort[0];
					continue;
				}
				max=arr[i];
				ans=teamArr[i];
			}
		}
		bw.write(ans);
		bw.flush();
		bw.close();
		br.close();
	}
}
