package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//Greedy 다시 풀어보기.
public class BOJ_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //회의의 개수
        int[][] meeting = new int[N][2];
        StringTokenizer st = null;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()); //시작점 ,
            int end = Integer.parseInt(st.nextToken()); // 끝점 ,
            meeting[i][0] = start;
            meeting[i][1] = end;
        }

        Arrays.sort(meeting, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                if(o1[1] == o2[1])
                    return o1[0]-o2[0];

                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int temp = 0;

        for(int i=0; i<meeting.length; i++){
            if(temp <= meeting[i][0]) {
                temp = meeting[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
