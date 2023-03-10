import java.io.*;
import java.util.*;
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
		for(int i=0;i<signs.length;i++) {
			if(!signs[i]) {
				absolutes[i]-=(absolutes[i]*2);
			}
			sum+=absolutes[i];
		}
		return sum;
    }
}