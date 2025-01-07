package Class3;

import java.io.*;
import java.util.StringTokenizer;
public class BOJ_18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] fields = new int[N+1][M+1];

        int maxFloor = -1;
        int minFloor = Integer.MAX_VALUE;
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=1; j<=M; j++){
                fields[i][j] = Integer.parseInt(st.nextToken());
                if(fields[i][j] > maxFloor){
                    maxFloor = fields[i][j];
                }
                if(fields[i][j] < minFloor){
                    minFloor = fields[i][j];
                }
            }
        }

        int minSeconds = Integer.MAX_VALUE;
        int maxBlock = 0;

        for(int i=minFloor; i<=maxFloor; i++){
            int seconds = 0;
            int block = B;

            for(int j=1; j<=N; j++){
                for(int k=1; k<=M; k++){
                    if(fields[j][k] > i ){
                        block += (fields[j][k] -i);
                        seconds += (fields[j][k]-i) *2;
                    }else if(fields[j][k] < i){
                        block -= (i-fields[j][k]);
                        seconds += (i- fields[j][k]);
                    }
                }
            }

            if(block < 0){
                continue;
            }

            if(minSeconds >= seconds){
                minSeconds = seconds;
                if(i >= maxBlock){
                    maxBlock = i;
                }
            }
        }

        System.out.println(minSeconds + " " + maxBlock);
    }
}
