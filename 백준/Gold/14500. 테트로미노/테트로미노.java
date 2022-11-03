import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int[][] arr, test_arr;
	static int N, M, sum, current, dfssum, max;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		//전체배열
		arr = new int[N][M];
		//실제 탐색할 최종합이 가장큰 4x4배열
		test_arr = new int[4][4];
		//입력값 받기
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		sum=0;
		current=0;
		dfssum=0;max=0;
		int idx=0;int jdx=0;

		//전체배열에서 4x4배열이 있다고 생각하고 해당 4x4범위의 총합을 비교하면서 이동
		//최종적으로 가장 총합이 큰 위치의 4x4배열을 가지고 테트로미노의 모든 경우의 수를 탐색
		//4x4배열인 이유 : 테트로미노 종류 5개가 모두 뛰어놀수 있는 배열의 최소크기가 4x4이므로
		while(true) {
			//탐색범위가 전체배열범위를 벗어나면 종료
			if(idx+3==N) {
				break;
			}
			//가로로 4x4배열이 이동하다가 범위를 벗어날 경우 한칸내리고 0자리부터 다시탐색
			if(jdx+3==M) {
				idx++;
				jdx=0;
				continue;
			}
			//4x4배열의 값을 기존배열에서 이식
			int I=idx;int J=jdx;
			sum=current;
			for(int p=0;p<4;p++) {
				J=jdx;
				for(int q=0;q<4;q++) {
					test_arr[p][q]=arr[I][J];
					J++;
				}
				I++;
			}
			//test_arr(4x4배열)만 가지고 최대합 구하기
			//파라미터 : 테트로미노배열idx
			dfs(0);
			current=0;
			jdx++;
		}
		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void dfs(int idx) {
		//탈출부
		if(idx==5) {
			return;
		}
		dfssum=0;
		//파랑
		if(idx==0) {
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					dfssum+=test_arr[i][j];
				}
				if(max<dfssum) {
					max=dfssum;
				}
				dfssum=0;
			}
			dfssum=0;
			for(int j=0;j<4;j++) {
				for(int i=0;i<4;i++) {
					dfssum+=test_arr[i][j];
				}
				if(max<dfssum) {
					max=dfssum;
				}
				dfssum=0;
			}
		}
		//노랑
		else if(idx==1) {
			for(int p=0;p<3;p++) {
				for(int q=0;q<3;q++) {					
					dfssum=0;
					for(int i=p;i<p+2;i++) {
						for(int j=q;j<q+2;j++) {
							dfssum+=test_arr[i][j];
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}
			
		}
		//주황
		else if(idx==2) {
			//0도
			for(int p=0;p<2;p++) {
				for(int q=0;q<3;q++) {
					dfssum=0;
					for(int j=q;j<q+1;j++) {						
						for(int i=p;i<p+3;i++) {
							dfssum+=test_arr[i][j];
							if(i==p+2) {
								dfssum+=test_arr[i][j+1];
							}
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}
			//90도
			dfssum=0;
			for(int p=0;p<3;p++) {
				for(int q=0;q<2;q++) {
					dfssum=0;
					for(int i=p;i<p+1;i++) {						
						for(int j=q;j<q+3;j++) {
							dfssum+=test_arr[i][j];
							if(j==q) {
								dfssum+=test_arr[i+1][j];
							}
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}
			//90도 좌우대칭
			dfssum=0;
			for(int p=0;p<3;p++) {
				for(int q=0;q<2;q++) {
					dfssum=0;
					for(int i=p;i<p+1;i++) {						
						for(int j=q;j<q+3;j++) {
							dfssum+=test_arr[i][j];
							if(j==q+2) {
								dfssum+=test_arr[i+1][j];
							}
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}
			//180도
			dfssum=0;
			for(int p=0;p<2;p++) {
				for(int q=1;q<4;q++) {
					dfssum=0;
					for(int j=q;j<q+1;j++) {						
						for(int i=p;i<p+3;i++) {
							dfssum+=test_arr[i][j];
							if(i==p) {
								dfssum+=test_arr[i][j-1];
							}
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}	
			//270도
			dfssum=0;
			for(int p=1;p<4;p++) {
				for(int q=0;q<2;q++) {
					dfssum=0;
					for(int i=p;i<p+1;i++) {						
						for(int j=q;j<q+3;j++) {
							dfssum+=test_arr[i][j];
							if(j==q+2) {
								dfssum+=test_arr[i-1][j];
							}
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}
			//270도 좌우대칭
			dfssum=0;
			for(int p=1;p<4;p++) {
				for(int q=0;q<2;q++) {
					dfssum=0;
					for(int i=p;i<p+1;i++) {						
						for(int j=q;j<q+3;j++) {
							dfssum+=test_arr[i][j];
							if(j==q) {
								dfssum+=test_arr[i-1][j];
							}
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}
			//좌우대칭
			dfssum=0;
			for(int p=0;p<2;p++) {
				for(int q=1;q<4;q++) {
					dfssum=0;
					for(int j=q;j<q+1;j++) {						
						for(int i=p;i<p+3;i++) {
							dfssum+=test_arr[i][j];
							if(i==p+2) {
								dfssum+=test_arr[i][j-1];
							}
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}
			//상하대칭
			dfssum=0;
			for(int p=0;p<2;p++) {
				for(int q=0;q<3;q++) {
					dfssum=0;
					for(int j=q;j<q+1;j++) {						
						for(int i=p;i<p+3;i++) {
							dfssum+=test_arr[i][j];
							if(i==p) {
								dfssum+=test_arr[i][j+1];
							}
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}
			
		}
		//초록
		else if(idx==3) {
			//0도,180도
			for(int p=0;p<2;p++) {
				for(int q=0;q<3;q++) {					
					dfssum=0;
					for(int i=p;i<p+3;i++) {
						for(int j=q;j<q+2;j++) {
							if((i==p && j==q+1) || (i==p+2 && j==q)) {
								continue;
							}
							dfssum+=test_arr[i][j];
							
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}
			//대칭
			dfssum=0;
			for(int p=0;p<2;p++) {
				for(int q=0;q<3;q++) {					
					dfssum=0;
					for(int i=p;i<p+3;i++) {
						for(int j=q;j<q+2;j++) {
							if((i==p && j==q) || (i==p+2 && j==q+1)) {
								continue;
							}
							dfssum+=test_arr[i][j];						
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}
			//90도,270도
			dfssum=0;
			for(int p=0;p<3;p++) {
				for(int q=0;q<2;q++) {					
					dfssum=0;
					for(int i=p;i<p+2;i++) {
						for(int j=q;j<q+3;j++) {
							if((i==p && j==q) || (i==p+1 && j==q+2)) {
								continue;
							}
							dfssum+=test_arr[i][j];				
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}
			//대칭
			dfssum=0;
			for(int p=0;p<3;p++) {
				for(int q=0;q<2;q++) {					
					dfssum=0;
					for(int i=p;i<p+2;i++) {
						for(int j=q;j<q+3;j++) {
							if((i==p+1 && j==q) || (i==p && j==q+2)) {
								continue;
							}
							dfssum+=test_arr[i][j];				
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}
			
		}
		//핑크
		else if(idx==4) {
			//0도
			for(int p=0;p<3;p++) {
				for(int q=0;q<2;q++) {					
					dfssum=0;
					for(int i=p;i<p+2;i++) {
						for(int j=q;j<q+3;j++) {
							if((i==p+1 && j==q) || (i==p+1 && j==q+2)) {
								continue;
							}
							dfssum+=test_arr[i][j];				
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}
			//180도
			dfssum=0;
			for(int p=0;p<3;p++) {
				for(int q=0;q<2;q++) {					
					dfssum=0;
					for(int i=p;i<p+2;i++) {
						for(int j=q;j<q+3;j++) {
							if((i==p && j==q) || (i==p && j==q+2)) {
								continue;
							}
							dfssum+=test_arr[i][j];				
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}
			//90도
			dfssum=0;
			for(int p=0;p<2;p++) {
				for(int q=0;q<3;q++) {					
					dfssum=0;
					for(int i=p;i<p+3;i++) {
						for(int j=q;j<q+2;j++) {
							if((i==p && j==q) || (i==p+2 && j==q)) {
								continue;
							}
							dfssum+=test_arr[i][j];
							
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}
			//270도
			dfssum=0;
			for(int p=0;p<2;p++) {
				for(int q=0;q<3;q++) {					
					dfssum=0;
					for(int i=p;i<p+3;i++) {
						for(int j=q;j<q+2;j++) {
							if((i==p && j==q+1) || (i==p+2 && j==q+1)) {
								continue;
							}
							dfssum+=test_arr[i][j];
							
						}
					}
					if(max<dfssum) {
						max=dfssum;
					}
				}
			}
		}
		
		dfs(idx+1);
	}
}
