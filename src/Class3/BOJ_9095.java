package Class3;

import java.io.*;
public class BOJ_9095 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        int[] count = new int[12];
        count[1] = 1; count[2] = 2; count[3] = 4;

        for(int i=4; i<count.length; i++){
            count[i] = count[i-3] + count[i-2] + count[i-1];
        }
        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(count[n]).append("\n");
        }

        System.out.print(sb.toString().trim());
    }
}
