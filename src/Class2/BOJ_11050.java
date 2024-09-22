package Class2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int result = 0;
        result = factorial(n) / (factorial(k) * factorial(n-k));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    public static int factorial(int number){
        if(number >1){
            return number* factorial(number -1);
        }
        else
            return 1;
    }
}
