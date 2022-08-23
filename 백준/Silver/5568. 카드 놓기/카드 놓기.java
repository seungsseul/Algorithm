import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static int[] arr;
	static boolean[] check;
	static int[] ans;
	static int k;
	static int cnt;
	static String word;
	static List<String> list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());
		arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine()); 
		}
		check = new boolean[n];
		ans = new int[k];
		list = new ArrayList<>();
		
		dfs(0);
		System.out.println(list.size());
		
	}
	
	public static void dfs(int num) {
		word = "";
		
	
		if(num == k) {
			//System.out.println(Arrays.toString(ans));
			for(int i=0;i<k;i++) {
				word+=String.valueOf(ans[i]);
			}
			if(!list.contains(word)) {			
				
				list.add(word);
			}
			
			
			cnt++;
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(check[i] == false) {
				ans[num] = arr[i];
				check[i] = true;
				dfs(num+1);
				check[i] = false;
			}
		}
		
	}
	
}