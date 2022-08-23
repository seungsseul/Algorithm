import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static String[] tree;
	static int[] left;
	static int[] right;
	static String word;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int testcase=1;testcase<=10;testcase++) {			
			int T = Integer.parseInt(br.readLine());
			tree = new String[T+1];
			left = new int[T+1];
			right = new int[T+1];
            word = "";
			for(int i=0;i<T;i++) {
				st = new StringTokenizer(br.readLine());
				int idx = Integer.parseInt(st.nextToken());
				tree[idx] = st.nextToken();
				if(st.countTokens() == 2) {
                    left[idx] = Integer.parseInt(st.nextToken());
                    right[idx] = Integer.parseInt(st.nextToken());
                }
                else if(st.countTokens() == 1) {
                    left[idx] = Integer.parseInt(st.nextToken());
                }
			}
			inorder(1);
			System.out.println("#"+testcase+" "+word);
		}
	}
	public static void inorder(int num) {
		if(tree[num]!=null) {
			inorder(left[num]);
			visit(num);
			inorder(right[num]);
		}
	}
	public static void visit(int num) {
		word+=tree[num];
	}
}