package Class1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        sb.append(num1 + num2).append("\n")
                .append(num1 - num2).append("\n")
                .append(num1 * num2).append("\n")
                .append(num1 / num2).append("\n")
                .append(num1 % num2);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
