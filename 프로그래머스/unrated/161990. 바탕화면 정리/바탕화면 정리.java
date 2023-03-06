import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(String[] wallpaper) {
        int len = wallpaper[0].length();
        String[][] wallpaper2 = new String[wallpaper.length][len];
        
        for(int i=0;i<wallpaper.length;i++) {
            String Input = wallpaper[i];
            for(int j=0;j<len;j++) {
                wallpaper2[i][j]=String.valueOf(Input.charAt(j));
            }
        }
        int leftx = Integer.MAX_VALUE, upy = Integer.MAX_VALUE;
        int rightx = -1, downy = -1; 

        List<int[]> list = new ArrayList<>();
        for(int i=0;i<wallpaper2.length;i++) {
            for(int j=0;j<len;j++) {
                if(wallpaper2[i][j].equals("#")) {
                	int[] addlist = {i,j};
                    list.add(addlist);
                }
            }
        }

        for(int i=0;i<list.size();i++) {
   
            if(list.get(i)[0]<leftx) {
            	leftx=list.get(i)[0];
            }
            if(list.get(i)[1]<upy) {
            	upy=list.get(i)[1];
            }
            if(list.get(i)[0]>rightx) {
            	rightx=list.get(i)[0];
            }
            if(list.get(i)[1]>downy) {
            	downy=list.get(i)[1];
            }

        }
        int[] ans = {leftx, upy, rightx+1, downy+1};
        return ans;
    }
}