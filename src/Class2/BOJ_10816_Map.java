package Class2;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_10816_Map {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //상근이가 구해야 하는 카드(중복X)를 정렬하여 갖고 있는 카드(중복O)를 이진 탐색으로 구함.
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        HashMap<Integer, Integer> countMap = new HashMap<>();


        for(int i=0; i<N; i++){
            int key = Integer.parseInt(st1.nextToken());
            countMap.put(key, countMap.getOrDefault(key,0)+1);
        }

        for(int i=0; i<M; i++) {
            int key = Integer.parseInt(st2.nextToken());
            sb.append(countMap.getOrDefault(key, 0)).append(" ");

        }

        System.out.print(sb.toString().trim());

    }

}
