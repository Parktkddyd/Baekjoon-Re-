package Class1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while(T-- >0) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st2.nextToken());
            int num2 = Integer.parseInt(st2.nextToken());

            sb.append(num1+num2).append("\n");
        };

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
