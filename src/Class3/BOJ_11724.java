package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11724 {
    static int node;
    static int edge;
    static boolean[] visited;
    static int[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());

        graph = new int[node+1][node+1];
        visited = new boolean[node+1];

            for (int i = 0; i < edge; i++) {
                st = new StringTokenizer(br.readLine());
                int n1 = Integer.parseInt(st.nextToken());
                int n2 = Integer.parseInt(st.nextToken());
                graph[n1][n2] = 1;
                graph[n2][n1] = 1;
            }
            int count = 0;
            for (int i = 1; i <= node; i++) {
                if (!visited[i]) {
                    bfs(i);
                    count++;
                }
            }

            System.out.print(count);
    }

public static void bfs(int n){
    Queue<Integer> myQueue = new LinkedList<>();
    int curr = n;

    myQueue.offer(curr);

    while(!myQueue.isEmpty()){
        curr = myQueue.poll();

        if(visited[curr])
            continue;

        visited[curr] = true;

        for(int next=1; next<=node; next++){
            if(graph[curr][next] == 1 && !visited[next]){
                myQueue.offer(next);
            }
        }
    }
}
}
