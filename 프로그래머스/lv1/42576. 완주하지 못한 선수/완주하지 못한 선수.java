import java.io.*;
import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
	//정렬하고
        Arrays.sort(participant);
        Arrays.sort(completion);
	//같은 인덱스의 값을 각각 비교했을때 다른 값이라면 해당 이름이 완주하지 못한 선수
        for(int i=0;i<completion.length;i++) {
            if(!participant[i].equals(completion[i])) {
                answer=participant[i];
                break;
            }
        }
	//만약 걸린사람이 없다면 배열의 마지막 이름이 완주하지 못한 선수
        if(answer.equals("")) {
	        answer=participant[participant.length-1];
	    }
        return answer;
    }
}
