package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] trees = new long[N];
        String[] str = br.readLine().split(" ");

        trees = Arrays.stream(str)
                .mapToLong(Integer::parseInt)
                .sorted()
                .toArray();

        //binary search
        long low = 0;
        long high = trees[trees.length-1];
        long max = binarySearch(low, high, M, trees);

        System.out.print(max);
    }

    private static long binarySearch(long low, long high, int m, long[] trees) {
        if(high < low){
            return high;
        }
        long mid = (high + low) / 2 ;
        long sum = 0L;

        //나무길이의 중간값이 기준일 때, 해당 나무길이보다 큰 나무들을 잘랐을 때 값이 M보다 작으면, 중간 값을 낮춰야함.
        //M보다 크면, 중간값을 높혀야함
        long[] compareTrees = Arrays.stream(trees)
                .filter(n-> n>mid)
                .toArray();

        for(int i = 0; i<compareTrees.length; i++){
            sum+= compareTrees[i] - mid;
        }

        if(sum == m)
            return mid;
        else if(sum < m){
            return binarySearch(low, mid-1, m, trees);
        }else{
            return binarySearch(mid+1, high, m, trees);
        }
    }
}
