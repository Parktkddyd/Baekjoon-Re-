package Class3;

import java.io.*;
public class BOJ_1003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[][] fibo = new int[41][2]; // 0번째 idx = 0의 개수, 1번째 idx = 1의 개수
        fibo[0][0] = 1; fibo[0][1] = 0;
        fibo[1][0] = 0; fibo[1][1] = 1;

        for(int i=2; i<=40; i++){
            fibo[i][0] += (fibo[i-2][0] + fibo[i-1][0]);
            fibo[i][1] += (fibo[i-2][1] + fibo[i-1][1]);
        }

        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            sb.append(fibo[N][0]).append(" ").append(fibo[N][1]).append("\n");
        }
        System.out.print(sb.toString().trim());
    }
}
