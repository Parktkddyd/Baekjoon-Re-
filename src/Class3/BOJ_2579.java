package Class3;

import java.io.*;
import java.util.ArrayList;

public class BOJ_2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] step = new int[N+1];
        int[] dp = new int[N+1];

        for (int i = 1; i < step.length; i++) {
            step[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = step[1];

        if (N >= 2) {
            dp[2] = step[1] + step[2];

            for (int i = 3; i < dp.length; i++) {
                dp[i] = Math.max(dp[i - 2], dp[i - 3] + step[i - 1]) + step[i];
            }
        }

        System.out.print(dp[N]);
    }
}
