class Solution {
    static int recovery, idx, last_attack, max_health;
    public int solution(int[] bandage, int health, int[][] attacks) {
        recovery = 0; idx = 0;
        last_attack = attacks[attacks.length-1][0];
        max_health = health;
        for(int i = 0; i <= last_attack; i++) {
            if(health <= 0) {
                return -1;
            }
            if(attacks[idx][0] == i) {
                recovery = 0;
                health -= attacks[idx][1];
                idx++;
                continue;
            }
            recovery++;
            health += bandage[1];
            if(recovery == bandage[0]) {
                recovery = 0;
                health += bandage[2];
            }
            if(health >= max_health) {
                health = max_health;
            }
        }
        if(health >= max_health) {
            health = max_health;
        }
        return health <=0 ? -1 : health;
    }
}