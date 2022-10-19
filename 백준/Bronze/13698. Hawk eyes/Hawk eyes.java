import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		arr[0]=1;arr[3]=2;
		String Input = sc.next();
		for(int i=0;i<Input.length();i++) {
			int tmp=0;
			if(String.valueOf(Input.charAt(i)).equals("A")) {
				tmp=arr[0];
				arr[0]=arr[1];
				arr[1]=tmp;
			}
			else if(String.valueOf(Input.charAt(i)).equals("B")) {
				tmp=arr[0];
				arr[0]=arr[2];
				arr[2]=tmp;
			}
			else if(String.valueOf(Input.charAt(i)).equals("C")) {
				tmp=arr[0];
				arr[0]=arr[3];
				arr[3]=tmp;
			}
			else if(String.valueOf(Input.charAt(i)).equals("D")) {
				tmp=arr[2];
				arr[2]=arr[1];
				arr[1]=tmp;
			}
			else if(String.valueOf(Input.charAt(i)).equals("E")) {
				tmp=arr[3];
				arr[3]=arr[1];
				arr[1]=tmp;
			}
			else if(String.valueOf(Input.charAt(i)).equals("F")) {
				tmp=arr[2];
				arr[2]=arr[3];
				arr[3]=tmp;
			}
		}
		for(int i=0;i<4;i++) {
			if(arr[i]==1) {
				System.out.println(i+1);
			}
		}
		for(int i=0;i<4;i++) {
			if(arr[i]==2) {
				System.out.println(i+1);
			}
		}
		sc.close();
	}
}
