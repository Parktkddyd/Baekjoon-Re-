package Class3;

import java.io.*;
public class BOJ_1463 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[1000001];


        for(int i=2; i<dp.length; i++){
            dp[i] = dp[i-1] +1;
            if(i%3 == 0){
                if(dp[i] > dp[i/3]+1){
                    dp[i] = dp[i/3]+1;
                }
            }

            if(i%2 == 0){
                if(dp[i] > dp[i/2] +1){
                    dp[i] = dp[i/2] +1;
                }
            }
        }

        System.out.print(dp[N]);
    }
}
