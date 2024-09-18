import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
	static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		sb.append("\\    /\\").append("\n").append(" )  ( ')").append("\n").append("(  /  )").append("\n").append(" \\(__)|");
		bw.write(sb.toString());bw.close();
	}
}
