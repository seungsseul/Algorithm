import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] cnt_arr = new int[2000001];
        for(int i=0; i<N; i++) {
        	int word = Integer.parseInt(br.readLine());
        	arr[i]=word;
        	cnt_arr[arr[i]+1000000]++;
        }
        for(int i=1;i<cnt_arr.length;i++) {
        	cnt_arr[i]+=cnt_arr[i-1];
        }
        int[] sort_arr = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--) {
        	cnt_arr[arr[i]+1000000]=cnt_arr[arr[i]+1000000]-1;
			sort_arr[cnt_arr[arr[i]+1000000]]=arr[i];
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<sort_arr.length; i++) {
            sb.append(sort_arr[i]+"\n");
        }
        System.out.print(sb);
    }
}