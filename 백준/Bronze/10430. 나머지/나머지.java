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

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());

		int B = Integer.parseInt(st.nextToken());

		int C = Integer.parseInt(st.nextToken());

		sb.append((A+B)%C).append("\n").append(((A%C) + (B%C))%C).append("\n").append((A*B)%C).append("\n").append(((A%C) * (B%C))%C);

		bw.write(sb.toString());

		bw.close();

		br.close();

		

	}

}