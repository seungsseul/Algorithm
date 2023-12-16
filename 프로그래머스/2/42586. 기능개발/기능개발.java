import java.util.*;
class Solution {
    public Queue<Integer> solution(int[] progresses, int[] speeds) {
        // 각 작업마다의 배포가능일수를 담을 배열
        int[] arr = new int[progresses.length];
        // 각 작업마다 배포가능일수 계산 = (100%-현재공정율)/개발속도
        // 단, 나머지가 있을 경우에는 +1하여 계산 (온전히 100%의 공정율을 넘겨야 하므로)
        for(int i=0;i<progresses.length;i++) {
            // 남은공정율
            int leftPer = 100-progresses[i];
            // 남은공정율/개발속도 하여 배포가능일수 계산 (단, 삼항연산자 활용 나머지가 있으면 +1)
            int num = leftPer%speeds[i]==0 ? leftPer/speeds[i] : leftPer/speeds[i]+1; 
            // 배열에 저장
            arr[i]=num;
        }
        // 각 배포마다 배포되는 작업의 수를 담을 큐
        Queue<Integer> answer = new LinkedList<>();
        // 선행배포작업 배포가능일수
        int firstProgress = arr[0];
        // 해당 배포에서 배포되는 작업의 수 (첫 작업은 for문에서 돌기때문에 0으로 세팅)
        int cicd = 0;
        for(int num : arr) {
            // 선행작업이 더 큰 경우 (뒷 작업은 다 되었더라도 해당 작업이 완료될때까지 기다려야함)
            if(Math.max(firstProgress, num)==firstProgress) {
                // 따라서 해당 배포에서 배포되는 작업의 수만 추가
                cicd++;
            }
            // 뒤 작업이 선행작업의 배포일에 영향을 받지 않는 경우
            else {
                // 현재까지 모인 작업의 수만큼 배포하기
                answer.offer(cicd);
                // 배포되는 작업의 수 초기화 (기본 한개는 배포되므로 1로 세팅)
                cicd=1;
                // 선행배포작업 현재 일수로 최신화
                firstProgress = num;
            }
        }
        //마지막 배포 추가
        answer.offer(cicd);
        return answer;
    }
}