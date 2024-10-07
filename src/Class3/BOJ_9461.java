package Class3;

import java.io.*;

public class BOJ_9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        long[] triangle = new long[101];
        triangle[1] = 1; triangle[2] = 1; triangle[3] = 1;
        triangle[4] = 2; triangle[5] = 2; /*triangle[6] = 3;
        triangle[7] = 4; triangle[8] = 5; triangle[9] = 7; triangle[10] = 9;*/
        //triangle[11] = triangle[10] + triangle[6] ... 12
        //triangle[12] = triangle[11] + triangle[7] ... 16

        for(int i=6; i<triangle.length; i++){
            triangle[i] = triangle[i-1] + triangle[i-5];
        }

        while(N-->0){
            int idx = Integer.parseInt(br.readLine());
            sb.append(triangle[idx]).append("\n");
        }

        System.out.print(sb.toString().trim());
    }
}
