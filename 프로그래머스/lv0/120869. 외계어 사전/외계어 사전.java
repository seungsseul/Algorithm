class Solution {
    public int solution(String[] spell, String[] dic) {
        loop:
        for(int i=0;i<dic.length;i++) {
            for(int j=0;j<spell.length;j++) {
                if(!dic[i].contains(spell[j])) {
                    continue loop;
                }
            }
            return 1;
        }
        return 2;
    }
}