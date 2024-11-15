import java.util.Arrays;
class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        int answer = -1;
        for(int i=mats.length-1;i>=0;i--) {
            if(searchMap(mats[i], park)) {
                answer = mats[i];
                break;
            }
        }
        return answer;
    }
    static boolean searchMap(int mat, String[][] map) {
        for(int i=0;i<map.length;i++) {
            for(int j=0;j<map[i].length;j++) {
                if(map[i][j].equals("-1")) {
                    System.out.println(i+" "+j);
                    if(checkMat(mat, i, j, map)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static boolean checkMat(int range, int r, int c, String[][] arr) {
        for(int i=r;i<r+range;i++) {
            for(int j=c;j<c+range;j++) {
                if(i>=0 && j>=0 && i<arr.length && j<arr[i].length) {
                    if(!arr[i][j].equals("-1")) {
                        return false;
                    }
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}