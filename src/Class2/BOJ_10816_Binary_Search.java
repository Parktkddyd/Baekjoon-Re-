package Class2;

import java.io.*;
import java.util.*;

public class BOJ_10816_Binary_Search {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //상근이가 구해야 하는 카드(중복X)를 정렬하여 갖고 있는 카드(중복O)를 이진 탐색으로 구함.
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(arr);

        for(int i=0; i<M; i++){
            int key = Integer.parseInt(st2.nextToken());

            sb.append((upperBound(key, arr) - LowerBound(key, arr))).append(" ");
        }

        System.out.print(sb.toString().trim());
    }

    static int LowerBound(int key, int[] arr) {
        int low = 0;
        int high = arr.length;

        while(low<high){
            int mid = low + ((high-low)/2);

            if(key <= arr[mid]){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

    static int upperBound(int key, int[] arr) {
        int low =0;
        int high = arr.length;

        while(low<high){
            int mid = low + ((high-low)/2);

            if(key<arr[mid])
                high = mid;
            else
                low = mid +1;
        }

        return low;
    }
}
