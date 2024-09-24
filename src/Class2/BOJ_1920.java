package Class2;

import java.io.*;
import java.util.*;

public class BOJ_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        ArrayList<Integer> arrayN;
        HashSet<Integer> hashSet = new HashSet<>();
        int[] arrayM = new int[M];


        for (int i = 0; i < N; i++) {
            hashSet.add(Integer.parseInt(st1.nextToken()));
        }
        arrayN = new ArrayList<>(hashSet);

        Collections.sort(arrayN);

        for (int i = 0; i < M; i++) {
            arrayM[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < M; i++)
            sb.append(search(arrayM[i], 0, arrayN.size()-1, arrayN)).append("\n");
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }

    public static int search(int key,int low, int high, ArrayList<Integer> arrayN) {
            if(low > high){
                //탐색 실패 시, (원소가 존재하지 않을 시, 0을 리턴)
                return 0;
            }
            int mid =(high + low) / 2;

            if(arrayN.get(mid) == key){
                //탐색을 성공했을 시, 1을 리턴
                return 1;
            }
            //만일 M의 값이 N의 중간값 보다 크면, N의 0번째 원소를 mid+1로 변경
            else if(arrayN.get(mid) < key){
                return search(key, mid+1, high, arrayN);
            }else{
                //N의 중간값보다 작으면, arrayN의 마지막원소의 인덱스가 중간값 -1
                return search(key, low, mid-1, arrayN);
            }

    }
}




