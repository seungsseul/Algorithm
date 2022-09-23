import java.util.Scanner;

public class Main {
	
	
	static int[][] map;
    static int w, h;
    static int[] dr = { -1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dc = { 0, 1, 1, 1, 0, -1, -1, -1};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            w = sc.nextInt();
            h = sc.nextInt();
            if(w == 0 && h == 0)
                break;
            map = new int[h][w];
            for(int i = 0; i < h; i++) {
                for(int j = 0; j < w; j++)
                    map[i][j] = sc.nextInt();
            }
            //섬 탐색하면서 1나오면 연결된 육지 삭제 작업 시작
            int cnt = 0;
            for(int i = 0; i < h; i++) {
                for(int j = 0; j < w; j++) {
                    if( map[i][j] == 1 ) {
                    	//섬하나 발견했으니 일단 그 면적이 어떻게 되던 카운트
                        cnt++;
                        //육지 삭제 작업 시작
                        dfs(i, j);
                    }
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
    
    
    
    
    static void dfs(int r, int c) {
        //현재 육지를 삭제
        map[r][c] = 0;
        for(int d = 0; d < 8; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];
            if( nr < 0 || nc < 0 || nr >= h || nc >= w ) {            	
            	continue;
            }
            //바다면 continue, 아니면 연결된 육지 0으로 삭제
            if( map[nr][nc] == 0 ) {            	
            	continue;
            }
            dfs(nr, nc);
        }
    }
}