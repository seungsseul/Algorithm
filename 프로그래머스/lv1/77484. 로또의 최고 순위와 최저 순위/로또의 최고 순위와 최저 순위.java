class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt=0;
		for(int i=0;i<lottos.length;i++) {
			for(int j=0;j<win_nums.length;j++) {
				if(lottos[i]==win_nums[j]) {
					cnt++;
					break;
				}
			}
		}
		int min=cnt;
		for(int i=0;i<lottos.length;i++) {
			if(lottos[i]==0) {
				cnt++;
			}
		}
		int max=cnt;
		if(min<2) {
			min=6;
		}
		else if(min==2) {
			min=5;
		}
		else if(min==3) {
			min=4;
		}
		else if(min==4) {
			min=3;
		}
		else if(min==5) {
			min=2;
		}
		else if(min==6) {
			min=1;
		}
		if(max<2) {
			max=6;
		}
		else if(max==2) {
			max=5;
		}
		else if(max==3) {
			max=4;
		}
		else if(max==4) {
			max=3;
		}
		else if(max==5) {
			max=2;
		}
		else if(max==6) {
			max=1;
		}
		
		int[] answer = {max,min};
        return answer;
    }
}