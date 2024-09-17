package Class1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input = null;
        while((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            sb.append(num1+num2).append("\n");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
