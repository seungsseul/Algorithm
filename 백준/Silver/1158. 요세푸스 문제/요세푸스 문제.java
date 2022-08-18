import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		
		Queue<Integer> queue = new LinkedList<>();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=N; i++)
			queue.add(i);
		
		while(queue.size() > 1) {
			for(int i=1; i<K; i++) {
				int value = queue.poll();
				queue.offer(value);
			}
			
			sb.append(queue.poll()).append(", ");
		}
		
		sb.append(queue.poll()).append('>');
		
		System.out.println(sb);
	}
}