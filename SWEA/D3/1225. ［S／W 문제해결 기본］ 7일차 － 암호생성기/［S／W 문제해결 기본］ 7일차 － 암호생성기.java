import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase=1;
		while(true) {
			if(testcase==11) {
				break;
			}
			int input=sc.nextInt();
			int[] queue = new int[8];
			for(int i=0;i<queue.length;i++) {
				queue[i] = sc.nextInt();
			}
			List<Integer> list = new ArrayList<>();
			for(int i : queue) {
				list.add(Integer.valueOf(i));
			}
			Loop1:
			while(true) {
				for(int j=1;j<=5;j++) {
					int tmp = list.get(0);
					list.remove(0);
					list.add(tmp-j);
					if(list.get(list.size()-1)<=0) {
						list.remove(list.size()-1);
						list.add(0);
						break Loop1;
					}
				}
			}
			System.out.print("#"+input+" ");
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
			testcase++;
		}
		sc.close();
	}
}