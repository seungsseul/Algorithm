import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int[][] arr = new int[num][5];
		for(int i=0;i<num;i++) {
			for(int j=0;j<5;j++) {
				int input = sc.nextInt();
				arr[i][j]=input;
			}
		}
		int[][] cnt_arr = new int[num][num];
		for(int i=0;i<num;i++) {
			for(int j=0;j<5;j++) {
				for(int k=0;k<num;k++) {
					if(k!=i && arr[i][j]==arr[k][j]) {
						cnt_arr[i][k]++;
					}
				}
			}
		}
		int[] fin = new int[num];
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(cnt_arr[i][j] != 0) {
					fin[i]++;
				}
			}
		}
		int max = 0;
		for(int i=0;i<fin.length;i++) {
			if(max<fin[i]) {
				max = fin[i];
			}
		}
		for(int i=0;i<fin.length;i++) {
			if(fin[i]==max) {
				System.out.println(i+1);
				break;
			}
		}
		sc.close();
	}
}