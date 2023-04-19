import java.io.*;
import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        //정답 배열
        int[] answer = new int[2];
        //끝말잇기 단어 중복체크해줄 리스트
        List<String> list = new ArrayList<>();
        //본인 순서번호와 본인이 몇번째차례인지 변수로만들기, 각각 answer[0]과 [1]에 해당
        int turn=0;
        int cycle=0;
        for(int i=0;i<words.length;i++) {
            //턴시작
            turn++;
            //각 사람이 몇번째 차례인지 한턴돌때마다 ++해주기
            if(i%n==0) {
                cycle++;
            }
            //단어 중복체크에 걸리면 배열답 만들고 break
            if(list.contains(words[i])) {
                answer[0]=turn;
                answer[1]=cycle;
                break;
            }
            //초기값 거르고
            if(i!=0) {
                //앞단어 끝말이 뒷단어 첫말이랑 같지 않으면 배열답 만들고 break
                char last = list.get(list.size()-1).charAt(list.get(list.size()-1).length()-1);
                char first = words[i].charAt(0);
                if(first!=last) {
                    answer[0]=turn;
                    answer[1]=cycle;
                    break;
                }   
            }
            //리스트에 단어추가
            list.add(words[i]);
            //한턴이 돌았으면 턴 변수 초기화
            if(turn%n==0) {
                turn=0;
            }
        }

        return answer;
    }
}
