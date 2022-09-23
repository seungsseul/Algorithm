import java.util.Scanner;

public class Main {
	
	static int[][] map;
	static boolean[][] check;
	static int n;
	static int[] dr = {0, 0, -1, 1};
	static int[] dc = {-1, 1, 0, 0};
	static int cnt;
	static int num;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    map = new int[n][n];
	    check = new boolean[n][n];
	    //맵세팅
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++)
	            map[i][j] = sc.nextInt();
	    }
	    int max=0;
	    num = 0; //기준이 되는 수
	    //장마철 기준이 될 수 있는 높이 경우의 수 전부 돌리기
	    for(int t=1;t<=100;t++) {
	    	num++;
	    	cnt = 0; //해당 기준에서 안전한 영역의 개수
	    	
	    	//한 기준에서의 탐색이 끝나면 check배열 초기화 세팅
	    	for (int i = 0; i < n; i++) {
		        for (int j = 0; j < n; j++)
		            check[i][j] = false;
		    }
	    	
	    	//기준점보다 지대가 높고, check배열이 false라면(dfs를 통해 이미 판단된 인접지대가 아니라면)
	    	for (int i = 0; i < n; i++) {
	    		for (int j = 0; j < n; j++) {
	    			if (map[i][j] > num && !check[i][j]) {
	    				cnt++;
	    				dfs(i, j);
	    			}
	    		}
	    	}
	    	//안전한 영역의 개수가 기존에 있던 개수보다 많다면 해당 수로 이전개수값 갱신
	    	if(max<cnt) {
	    		max=cnt;
	    	}
	    	
	    }
	    //갱신된 최대수 출력
	    if(max==0) {
	    	System.out.println(1);
	    }
	    else {	    	
	    	System.out.println(max);
	    }
	    sc.close();
	}


	static void dfs(int r, int c) {
		
		//해당 지점  true로 바꾸고 4방탐색하여 인접지대 탐색하기
		check[r][c] = true;
		
	    for (int d = 0; d < 4; d++) {
	        int nr = r + dr[d];
	        int nc = c + dc[d];
	        if (nr < 0 || nc < 0 || nr >= n || nc >= n) {
	            continue;
	        }

	        if (check[nr][nc] || map[nr][nc] <= num) {
	            continue;
	        }
	        dfs(nr, nc);
	    }
	}
}

