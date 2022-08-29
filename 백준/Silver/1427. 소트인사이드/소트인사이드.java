import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] arr = new char[String.valueOf(N).length()];
		for(int i=0;i<arr.length;i++) {
			arr[i] = String.valueOf(N).charAt(i);
		}
		for(int i=0;i<arr.length;i++) {
			char tmp = '0';
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					tmp=arr[j];
					arr[j]=arr[i];
					arr[i]=tmp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		br.close();
	}
}
