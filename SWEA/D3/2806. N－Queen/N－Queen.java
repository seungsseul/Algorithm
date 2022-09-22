import java.util.Scanner;


public class Solution {
	static int N; 
	static int[][] map;
	static int ans;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        for(int t=1;t<=T;t++) {
            N = sc.nextInt();
        	ans = 0;
        	map = new int[N][N];

        	putQueen(0);
        	System.out.println("#"+t+" "+ans);
        }

	}

	private static void putQueen(int idx) {
		
		if(idx == N){
            ans++;
            return;
        }

        for(int c = 0; c < N; c++){
        	
            if(isPutable(idx,c)) {
            	
                map[idx][c] = 1;
                putQueen(idx+1);
                map[idx][c] = 0;
            }
        }
	}

	private static boolean isPutable(int idx, int c) {
		int left = c;
        int right = c;
         
        for(int i = idx-1; i>=0; i--){
            left--;
            right++;
             
            if(map[i][c] == 1) { 
            	return false;
            }
            if(left>=0 &&map[i][left] == 1) {
            	return false; 
            }
            if(right <N&&map[i][right] == 1) {
            	return false; 
            }
        }
         
        return true;
	}
}