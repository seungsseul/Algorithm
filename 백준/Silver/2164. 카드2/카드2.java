import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] queue = new int[N];
		int inputnum = 1;
		for(int i=0;i<queue.length;i++) {
			queue[i] = inputnum;
			inputnum++;
		}
		Queue<Integer> queue2 =new LinkedList<Integer>();
		for(int i : queue) {
			queue2.offer(Integer.valueOf(i));
		}
		for(int i=0;i<queue.length;i++) {
			if(queue2.size()==1) {
				break;
			}
			queue2.poll();
			int tmp = queue2.peek();
			queue2.poll();
			queue2.offer(tmp);
		}
		System.out.println(queue2.peek());
		sc.close();
	}
}