package Class2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        boolean[] isPrime = new boolean[1000001];
        isPrime[0] = true;
        isPrime[1] = true;

        for(int i=2; i<isPrime.length; i++){
            if(isPrime[i])
                continue;
            for(int j=i*2; j<isPrime.length; j+=i){
                if(j%i==0)
                    isPrime[j] = true;
            }
        }

        for(int k = M; k<=N; k++){
            if(!isPrime[k])
                sb.append(k).append("\n");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();

    }
}
