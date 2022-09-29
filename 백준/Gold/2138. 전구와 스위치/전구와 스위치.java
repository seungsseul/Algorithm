import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] arr1, arr2, ans;
	static int N, cnt1, cnt2;
	static boolean flag;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(br.readLine());
		arr1 = new int[N]; //첫번째 전구를 눌렀을때
		arr2 = new int[N]; //첫번째 전구를 안눌렀을때
		ans = new int[N];
		String a = br.readLine();
		for(int i=0;i<N;i++) {
			arr1[i]=Character.getNumericValue(a.charAt(i));
			arr2[i]=Character.getNumericValue(a.charAt(i));
		}
		String b = br.readLine();
		for(int i=0;i<N;i++) {
			ans[i]=Character.getNumericValue(b.charAt(i));
		}
		
		arr1[0] = Math.abs(arr1[0]-1);
		arr1[1] = Math.abs(arr1[1]-1);
		cnt1++;
		for(int i=0;i<=N-3;i++) {
			if(arr1[i]!=ans[i]) {
				arr1[i] = Math.abs(arr1[i]-1);
				arr1[i+1] = Math.abs(arr1[i+1]-1);
				arr1[i+2] = Math.abs(arr1[i+2]-1);
				cnt1++;
			}
		}
		if(arr1[N-1]!=ans[N-1] && arr1[N-2]!=ans[N-2]) {
			cnt1++;
		}
		else if(arr1[N-1]==ans[N-1] && arr1[N-2]!=ans[N-2]) {
			cnt1=-1;
		}
		else if(arr1[N-1]!=ans[N-1] && arr1[N-2]==ans[N-2]) {
			cnt1=-1;
		}
		

		for(int i=0;i<=N-3;i++) {
			if(arr2[i]!=ans[i]) {
				arr2[i] = Math.abs(arr2[i]-1);
				arr2[i+1] = Math.abs(arr2[i+1]-1);
				arr2[i+2] = Math.abs(arr2[i+2]-1);
				cnt2++;
			}
		}
		if(arr2[N-1]!=ans[N-1] && arr2[N-2]!=ans[N-2]) {
			cnt2++;
		}
		else if(arr2[N-1]==ans[N-1] && arr2[N-2]!=ans[N-2]) {
			cnt2=-1;
		}
		else if(arr2[N-1]!=ans[N-1] && arr2[N-2]==ans[N-2]) {
			cnt2=-1;
		}
		if(cnt1==-1 || cnt2==-1) {
			if(cnt1>cnt2) {
				System.out.println(cnt1);
			}
			else if(cnt1==cnt2) {
				System.out.println(-1);
			}
			else {
				System.out.println(cnt2);
			}
		}
		else {			
			System.out.println(Math.min(cnt1, cnt2));
		}
	}

}
