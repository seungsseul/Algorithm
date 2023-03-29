class Solution {
    public int solution(int n) {
        int ans = 0;
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