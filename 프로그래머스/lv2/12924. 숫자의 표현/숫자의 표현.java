class Solution {
    public int solution(int n) {
        int ans = 0;
	    	//완탐
	    	//1부터 차례대로 1씩 더해진 수(plus)를 tmp에 더해가면서 만약 n보다 크면 다음수, n과 같으면 ans++해주고 다음수 비교 
		for(int i=1;i<=n;i++) {	
			int tmp=i;
			int plus=tmp+1;
			while(true) {
				if(tmp>n) {
					break;
				}
				if(tmp==n) {
					ans++;
					break;
				}
				tmp+=plus;
				plus++;
			}
		}
		return ans;
    }
}
