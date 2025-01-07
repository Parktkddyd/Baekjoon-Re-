package Class3;
import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0) {
                pq.offer(num);
            }else{
                if(!pq.isEmpty()){
                    sb.append(pq.poll()).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }
        }
        System.out.println(sb.toString().trim());
    }
}
