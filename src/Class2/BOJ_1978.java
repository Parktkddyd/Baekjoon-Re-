package Class2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer strNum = new StringTokenizer(br.readLine());
        boolean[] isPrime = new boolean[1001];
        isPrime[0] = true; isPrime[1] = true;

        for(int i=2; i<isPrime.length; i++){
            if(isPrime[i]) {
                continue;
            }
            for(int j=i*2; j<isPrime.length; j+=i){
                if(j%i == 0){
                    isPrime[j] = true;
                }
            }
        }

        int result = 0;
        while(strNum.hasMoreTokens()){
            int num = Integer.parseInt(strNum.nextToken());
            if(!isPrime[num])
                result++;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
