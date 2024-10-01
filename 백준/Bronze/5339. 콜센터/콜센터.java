import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		sb.append("     /~\\ ").append("\n");
		sb.append("    ( oo| ").append("\n");
		sb.append("    _\\=/_ ").append("\n");
		sb.append("   /  _  \\ ").append("\n");
		sb.append("  //|/.\\|\\\\ ").append("\n");
		sb.append(" ||  \\ /  || ").append("\n");
		sb.append("============").append("\n");
		sb.append("|          |").append("\n");
		sb.append("|          |").append("\n");
		sb.append("|          |");
		bw.write(sb.toString());bw.close();br.close();
	}
}