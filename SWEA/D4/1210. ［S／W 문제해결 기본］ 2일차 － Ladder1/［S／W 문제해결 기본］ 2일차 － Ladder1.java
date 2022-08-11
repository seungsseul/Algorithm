import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[100][100];
        String[] tample = new String[100];
        for(int t=1;t<=10;t++) {
        	int N = Integer.parseInt(br.readLine());
    		List<Integer> list = new ArrayList<>();
    		List<Integer> point = new ArrayList<>();
        	for(int i=0;i<100;i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		String[] tokens = new String[100];
            	int idx=0;
            	while (st.hasMoreTokens()) {
            		tokens[idx] = st.nextToken();
            		idx++;
            	}
            	for(int j=0;j<100;j++) {
                	tample[j]=tokens[j];
            	}
                for(int j=0;j<100;j++) {
                	arr[i][j]=Integer.parseInt(tample[j]);
                	if(arr[i][j]==2) {
                		point.add(i);
                		point.add(j);
                	}
            		if(i==0) {
            			if(arr[0][j]==1) {
                			list.add(j);
                		}
            		}
            	}
            }
        	int r = point.get(0);
        	int c = point.get(1);
        	int ans = 0;
        	for(int i=0;i<list.size();i++) {
        		if(list.get(i)==c) {
        			ans = i;
        		}
        	}
        	int[] dc = {-1,1};
        	
    		for(int i=0;i<100;i++) {
        		r--;
        		c=list.get(ans);
        		if(r==0) {
        			System.out.println("#"+N+" "+list.get(ans));
        			break;
        		}
        		for(int j=0;j<dc.length;j++) {
        			int nc = c + dc[j];
        			if (nc >= 0 && nc < 100) {
        				if(arr[r][nc]==1) {
        					if(dc[j]==-1) {
        						ans--;
        						break;
        					}
        					else if(dc[j]==1) {
        						ans++;
        						break;
        					}		
        				}
        			}
        			else {
        				continue;
        			}
        		}
    		}
        }
	}
}