package Class2;

import java.io.*;
import java.util.*;
public class BOJ_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] KN = br.readLine().split(" ");
        int K = Integer.parseInt(KN[0]);
        int N = Integer.parseInt(KN[1]);

        int[] numArr = new int[K];

        for(int i=0; i<K; i++){
            numArr[i] = Integer.parseInt(br.readLine());
        }
        //선 정렬, (가장 큰 수를 찾기 위함)
        Arrays.sort(numArr);


        long min = 0;
        long max = numArr[numArr.length -1] +1;


        while(min < max){
            long count = 0;
            long mid = (min + max) / 2;

            for(int i=0; i<numArr.length; i++){
                count += numArr[i] / mid;
            }

            if(count < N){
                max = mid;
            }else{
                min = mid +1;
            }

        }
        System.out.println(min-1);
    }
}
