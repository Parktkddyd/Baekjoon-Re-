package Class3;

import java.io.*;
import java.util.*;

public class BOJ_11399 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numArray = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int idx = 0;
        while(st.hasMoreTokens()){
            numArray[idx++] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numArray);

        int aSum = 0;
        int sum = 0;
        for(int i=0; i<numArray.length; i++){
            sum += numArray[i];
            aSum += sum;
        }

        System.out.print(aSum);
    }
}
