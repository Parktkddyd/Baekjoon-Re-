package Class2;

import java.io.*;
import java.util.Arrays;

public class BOJ_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr  = new int[N];

        for(int i=0; i<arr.length; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int trimRatio = (int)Math.round(arr.length * 0.15);

        int sum = 0;
        double avg = 0.0;
        for(int i=trimRatio; i<arr.length-trimRatio; i++){
            sum += arr[i];
        }
        avg = (double)sum / (arr.length-2*trimRatio);

        System.out.print(Math.round(avg));
    }
}
