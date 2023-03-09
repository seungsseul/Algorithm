class Solution {
    public int solution(String s) {
        int ans = 0;
		loop:
		while(true) {
			if(s.equals("")) {
				break;
			}
			char x = s.charAt(0);
			int x_cnt=1;
			int cnt=0;

			if(s.length()>1) {				
				for(int i=1;i<s.length();i++) {
					if(s.charAt(i)!=x) {
						cnt++;
					}
					else {
						x_cnt++;
					}
					if(cnt==x_cnt) {
						ans++;
						s=s.substring(i+1);
						continue loop;
					}
				}
			}
			ans++;
			break;
        }
		
		return ans;
    }
}