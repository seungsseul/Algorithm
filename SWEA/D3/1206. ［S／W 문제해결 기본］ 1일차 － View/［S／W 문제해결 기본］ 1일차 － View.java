import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int width = sc.nextInt();
			int res = 0;
			int[] arr = new int[width];
			for (int i = 0; i < width; i++) {
				int height = sc.nextInt();
				arr[i] = height;
			}
			for (int j = 2; j <= arr.length - 3; j++) {
				if (arr[j] > arr[j + 1] && arr[j] > arr[j + 2]) {
					if (arr[j] > arr[j - 1] && arr[j] > arr[j - 2]) {
						int[] ex_array = { arr[j + 1], arr[j + 2], arr[j - 1], arr[j - 2] };
						int max = 0;
						for (int k = 0; k < ex_array.length; k++) {
							if (max < ex_array[k]) {
								max = ex_array[k];
							}
						}
						res += (arr[j] - max);
					}
				}
			}
			System.out.println("#" + tc + " " + res);
		}
	}
}
