package Class1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2475 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        int result = 0;

        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            sum += num*num;
        }
        result = sum%10;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }
}
