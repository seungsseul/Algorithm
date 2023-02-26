class Solution {
    public int solution(int a, int b, int n) {
        int ans=0;
        while(true) {
        	if(n<a) {
        		break;
        	}
        	int givemart = (n/a)*a;
        	n-=givemart;
        	n+=(givemart/a*b);
        	ans+=(givemart/a*b);
        }
        return ans;
    }
}