import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] map = new int[10][10];
    static int[] Paper = {5, 5, 5, 5, 5};
    static boolean[] check;
    static int result;
    static int cnt;
    static int tmp;
    static int ans = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //세팅
        for(int i=0; i<10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<10; j++) {
            	map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0,0);
        //가지고있는 색종이로 다 커버를 못하는 경우 고려하기
        if(ans==Integer.MAX_VALUE) {
        	System.out.println(-1);
        }
        else {
        	System.out.println(ans);
        }
    }
    public static void dfs(int r, int c, int count) {
        //(0,0)부터 (9,9)까지 갈 경우
    	//r은 9인상태로 c가 10이되었을때를 의미함 (=배열을 벗어났을때)
    	if(r==9 && c==10) {
    		ans = Math.min(ans, count);
    		return;
        }
        
    	if(count>=ans) {
    		return;
    	}
    	
    	//배열 줄바꿈
    	if(c>9) {
    		dfs(r+1,0,count);
    		return;
    	}
    	//배열에서 1찾을시 탐색
        if(map[r][c]==1) {
        	//큰 종이부터
        	for(int i=4;i>=0;i--) {
                //종이가 0보다많고 놓아도 되는경우라면
        		if(Paper[i]>0 && isPutable(r,c,i+1)) {
        			putPaper(r,c,0,i+1); //종이놓고
        			Paper[i]--; //종이카운트감소
        			dfs(r,c+1,count+1); //또 같은 행동 반복
        			putPaper(r,c,1,i+1); //종이 다시 원상복구
        			Paper[i]++; //종이 원상복구 되었으니 개수 늘리기
        		}
        	}
        }
        //배열에 1이 안나올때
        else {
        	dfs(r,c+1,count);
        }
    }
    //해당 1의 좌표에서 종이의 크기만큼 종이 놓기
    public static void putPaper(int r, int c,int value, int size) {
		for(int i=r;i<r+size;i++) {
			for(int j=c;j<c+size;j++) {
				map[i][j]=value;
			}
		}
		
	}
    
    //해당자리가 10x10의 범위를 벗어나지 않고 1이라면 종이 놓을 수 있음 
	public static boolean isPutable(int r, int c, int size) {
		for(int i=r;i<r+size;i++) {
			for(int j=c;j<c+size;j++) {
				if(!(i>=0 && j>=0 && i<10 && j<10) || map[i][j]!=1) {
					return false;
				}
			}
		}
        return true;
    }

}