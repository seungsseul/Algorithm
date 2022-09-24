import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[][] map;
    static int[][] day_arr;
    static int W, H;
    static int[] dr = { -1,1,0,0 };
    static int[] dc = { 0,0,-1,1 };
    
    static class Node{
        int r, c;
        Node(int r, int c ){
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isOk = true;
	    W = sc.nextInt();
	    H = sc.nextInt();
	    map = new int[H][W]; //토마토 배열
	    day_arr = new int[H][W]; //날짜 배열
	    //두 배열 값 세팅
	    for (int i = 0; i < H; i++) {
	        for (int j = 0; j < W; j++) {
	        	map[i][j] = sc.nextInt();
	        	day_arr[i][j]=0;
	        	
	        }
	    }
	    Queue<Node> queue = new LinkedList<>();
	    //토마토 배열에서 만약 토마토가 담겨있지 않은 구석이 하나라도 있다면 isOK false로 바꿈
	    //익은 토마토를 우선적으로 큐에 담아줌
	    for (int i = 0; i < H; i++) {
	        for (int j = 0; j < W; j++)
	            if(map[i][j]==0) {
	            	isOk=false;
	            }
	            else if(map[i][j]==1) {
	            	queue.add(new Node(i,j));
	            }
	    }
	    //배열을 돌다가 익은토마토 발견시 큐에 담긴 순서대로 빼주면서 4방탐색
	    for (int i = 0; i < H; i++) {
	        for (int j = 0; j < W; j++) {
	            if (map[i][j] == 1) {
	                while( ! queue.isEmpty()) {
	                	
	                    Node n = queue.poll();
	                    //4방탐색해서 0인곳(아직 안익은 토마토있는곳)이 있으면 1로 바꿔주고
	                    for(int d = 0; d < 4; d++) {
	                        int nr = n.r + dr[d];
	                        int nc = n.c + dc[d];
	                        if( nr < 0 || nc < 0 || nr >= H || nc >= W )
	                            continue;
	                        if( map[nr][nc] == -1) {
	                        	continue;
	                        }
	                        if( map[nr][nc] >= 1) {
	                        	continue;
	                        }
	                        queue.add(new Node(nr,nc));
	                        map[nr][nc] = 1;
	                        day_arr[nr][nc] = day_arr[n.r][n.c]+1;                       
	                    }
	                }
	            }
	            else if (map[i][j]==-1) {
	            	continue;
	            }
	        }
	        
	    }
	    
	    int max=Integer.MIN_VALUE;
	    Loop1:
	    for (int i = 0; i < H; i++) {
	        for (int j = 0; j < W; j++) {
	        	//토마토 배열을 탐색해서 만약 0이 있다면 (아직 안익은 토마토가 있다면) max값 -1로 설정후 출력
	        	if(map[i][j]==0) {
	        		max=-1;
	        		break Loop1;
	        	}
	        	//날짜 배열을 탐색해서 만약 기존 max값보다 크다면 해당값을 max값으로 최신화 (이값이 곧 토마토가 모두 익는 최소날짜임)
	        	if(max<day_arr[i][j]) {
	        		max=day_arr[i][j];
	        	}
	        }
	    }
	    //앞서 토마토가 애초에 익은 상태임을 판단하는 isOk가 false이면 max값, 아니라면 0출력
	    if(!isOk) {	    	
	    	System.out.println(max);
	    }
	    else {
	    	System.out.println(0);
	    }
	}
}