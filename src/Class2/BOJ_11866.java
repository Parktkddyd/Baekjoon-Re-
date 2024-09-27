package Class2;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for(int i=1; i<=N; i++)
            q1.add(i);

        int result = 0;

        while(q1.size()>1){
            for(int i=0; i<K-1; i++)
                q1.add(q1.poll());
            sb.append(q1.poll()).append(", ");
        }
        sb.append(q1.poll()).append(">");
        System.out.print("<" + sb.toString().trim());
    }
}
