package Class1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            String[] str = br.readLine().split(" ");
            for(int j=0; j<str[1].length(); j++)
                sb.append(String.valueOf(str[1].charAt(j)).repeat(Integer.parseInt(str[0])));
            sb.append("\n");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();

    }
}
