package Class3;

import java.io.*;
import java.util.ArrayList;

public class BOJ_17626 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        dp[1] = 1;

        for(int i=2; i<=N; i++){
            int min = Integer.MAX_VALUE;
            for(int j=1; j*j<=i; j++){
                //구하려는 숫자i에서, 1부터의 i까지의 제곱수들을 차례로 빼가면서 최소 개수를 구한뒤 해당 제곱수 개수 1을 더하는 방식으로 최솟값을 구함
                min = Math.min(min, dp[i-j*j]);
            }
            dp[i] = min +1;
        }

        System.out.print(dp[N]);
    }
}
