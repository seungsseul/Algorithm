class Solution {
    public String solution(int[] food) {
        String answer = "0";
		int idx=-1;
		for(int i=food.length-1;i>=0;i--) {
			idx=i;
			if(food[i]%2==1) {
				food[i]--;
			}
			for(int j=0;j<food[i]/2;j++) {				
				answer+=String.valueOf(idx);
			}
		}
		String tmp="";
		for(int i=answer.length()-1;i>=1;i--) {
			tmp+=String.valueOf(answer.charAt(i));
		}
		tmp+=answer;
		return tmp;
    }
}