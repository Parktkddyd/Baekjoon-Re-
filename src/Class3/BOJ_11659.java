package Class3;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_11659 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] numArr = new int[N];

        int idx = 0;
        while(st.hasMoreTokens()){
            numArr[idx++] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N+1];

        dp[0] = 0; dp[1] = numArr[0];

        for(int i=2; i<=N; i ++){
            dp[i] = dp[i-1] + numArr[i-1];
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int rangeStart = Integer.parseInt(st.nextToken()) -1;
            int rangeEnd = Integer.parseInt(st.nextToken());

            int sum = dp[rangeEnd]-dp[rangeStart];

            sb.append(sum).append("\n");
        }

        System.out.print(sb.toString().trim());
    }
}
