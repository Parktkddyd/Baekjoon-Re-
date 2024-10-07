package Class3;

import java.io.*;
public class BOJ_11047 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        int[] coin = new int[N];
        for(int i = 0; i<coin.length; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        int min = 0;
        int coinMax = coin.length-1;

        while(K > 0){
            int count = K / coin[coinMax];
            if(count > 0) {
                min += count;
                K -= coin[coinMax] * count;
            }
            else {
                coinMax--;
            }
        }

        System.out.print(min);
    }
}
