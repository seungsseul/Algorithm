class Solution {
    public int solution(String t, String p) {
        long tmp_p = Long.parseLong(p);
		int cnt=0;
		for(int i=0;i<=t.length()-p.length();i++) {
			long tmp_t = Long.parseLong(t.substring(i, i+p.length()));
			if(tmp_t<=tmp_p) {
				cnt++;
			}
		}
		return cnt;
    }
}