import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		
		Queue<Integer> queue = new LinkedList<>();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i=1; i<=N; i++)
			queue.add(i);
		
		while(queue.size() > 1) {
			//for문을 순회하면서 K번째가 나오기전까지 삭제와 삽입 반복
			for(int i=1; i<K; i++) {
				int value = queue.poll();
				queue.offer(value);
			}
			//K번째 수를 빼주면서 sb에 추가
			sb.append(queue.poll()).append(", ");
		}
		//queue에 요소가 1개남았을때 이를 마저빼주고 괄호닫긴
		sb.append(queue.poll()).append('>');
		
		System.out.println(sb);
		sc.close();
	}
}