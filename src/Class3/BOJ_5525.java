package Class3;

import java.io.*;
public class BOJ_5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();
        int[] memo = new int[S];
        int result = 0;
        for(int i=1; i<S-1; i++){
            if(str[i] == 'O' && str[i+1] == 'I')
                memo[i+1] = memo[i-1] +1;

            if(memo[i+1] >= N && str[(i+1)-(2*N)] =='I'){
                result++;
            }
        }

        System.out.print(result);
    }
}