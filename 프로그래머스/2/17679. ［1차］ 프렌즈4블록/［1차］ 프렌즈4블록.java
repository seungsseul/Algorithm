import java.util.Arrays;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
class Solution {
    static int cnt, tmp, answer;
    static int[] dr = {0, -1, -1};
    static int[] dc = {-1, 0, -1};
    static String[][] map;
    static boolean[][] visited;
    static ArrayList<int[]> list;
    static Queue<String> q;
    public int solution(int m, int n, String[] board) {
        answer = 0;
        map = new String[m][n];
        visited = new boolean[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                map[i][j]=String.valueOf(board[i].charAt(j));
            }
        }
        while(true) {
            for(int i=m-1;i>=0;i--) {
                for(int j=n-1;j>=0;j--) {
                    check(i, j);
                }
            }
            downBlock(m, n);
            visited = new boolean[m][n];
            tmp = 0;
            for(int i=0;i<m;i++) {
                for(int j=0;j<n;j++) {
                    if(map[i][j].equals("")) {
                        visited[i][j]=true;
                        tmp++;
                    }
                }
            }
            if(tmp==answer) {
                break;
            }
            answer = tmp;
        }
        return answer;
    }
    static void check(int r, int c) {
        list = new ArrayList<>();
        for(int d=0;d<3;d++) {
            int nr = r+dr[d];
            int nc = c+dc[d];
            if(nr<0 || nc<0 || nr>=map.length || nc>=map[0].length) {
                return;
            }
            if(map[nr][nc].equals("")) {
                return;
            }
            if((!map[nr][nc].equals(map[r][c]))) {
                return;
            }
            int[] tmp = new int[2];
            tmp[0]=nr; tmp[1]=nc;
            list.add(tmp);
        }
        visited[r][c]=true;
        for(int d=0;d<3;d++) {
            int[] tmp = list.get(d);
            visited[tmp[0]][tmp[1]]=true;
        }
    }
    static void downBlock(int r, int c) {
        for(int i=0;i<map[0].length;i++) {
            q = new LinkedList<>();
            cnt = 0;
            for(int j=0;j<map.length;j++) {
                if(visited[j][i]) {
                    cnt++;
                    continue;
                }
                q.offer(map[j][i]);
            }
            for(int j=0;j<cnt;j++) {
                map[j][i] = "";
            }
            if(!q.isEmpty()) {
                for(int j=cnt;j<map.length;j++) {
                    map[j][i] = q.poll();
                }
            }
        }
    }
}