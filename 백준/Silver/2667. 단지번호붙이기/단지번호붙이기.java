import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static int[][] map;
	static boolean[][] check;
	static int n;
	static int[] dr = {0, 0, -1, 1};
	static int[] dc = {-1, 1, 0, 0};
	static int cnt;
	static int count;
	static List<Integer> list;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    n = sc.nextInt();
	    map = new int[n][n];
	    check = new boolean[n][n];
	    for (int i = 0; i < n; i++) {
	        String Input = sc.next();
	        for (int j = 0; j < n; j++)
	            map[i][j] = Character.getNumericValue(Input.charAt(j));
	    }
	    list = new ArrayList<>();
	    cnt = 0;
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            if (map[i][j] == 1 && !check[i][j]) {
	            	count=0;
	                cnt++;
	                dfs(i, j);
	                list.add(count);
	            }
	        }
	    }
	    System.out.println(cnt);
	    Collections.sort(list);
	    for(int i=0;i<list.size();i++) {
	    	System.out.println(list.get(i));
	    }
	    sc.close();
	}


	static void dfs(int r, int c) {


		count++;
	    map[r][c] = cnt;
	    check[r][c] = true;
	    for (int d = 0; d < 4; d++) {
	        int nr = r + dr[d];
	        int nc = c + dc[d];
	        if (nr < 0 || nc < 0 || nr >= n || nc >= n) {
	            continue;
	        }

	        if (check[nr][nc] || map[nr][nc] == 0) {
	            continue;
	        }
	        dfs(nr, nc);
	    }
	}
}
