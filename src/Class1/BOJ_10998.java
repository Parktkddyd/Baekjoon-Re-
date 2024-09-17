package Class1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int result = num1 * num2;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
