package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_1260 {
    static int N;
    static int M;
    static int V;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        int[][] graph = new int[N+1][N+1];
        for(int i=0;i < M; i++){
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());

            //양방향 이기 때문에 반대에도 값을 입력해야함.
            graph[first][last] = 1;
            graph[last][first] = 1;
        }
        dfs(V, graph);
        bfs(V, graph);

        System.out.print(sb.toString().trim());
    }

    public static void bfs(int v, int[][] graph) {
        sb.append("\n");

        Queue<Integer> myQueue = new LinkedList<>();
        boolean[] visited = new boolean[N+1];

        myQueue.offer(v);

        while(!myQueue.isEmpty()){
            int curr = myQueue.poll();

            if(visited[curr])
                continue;

            visited[curr] = true;
            sb.append(curr).append(" ");

            for(int next=1; next< graph.length; next++){
                if(!visited[next] && graph[curr][next] != 0){
                    myQueue.offer(next);
                }
            }
        }

    }

    public static void dfs(int V, int[][] graph){

        boolean[] visited = new boolean[N+1];
        Stack<Integer> mystack = new Stack<>();

        mystack.add(V);

        while(!mystack.isEmpty()){
            int curr = mystack.pop();

            if(visited[curr])
                continue;

            visited[curr] = true;
            sb.append(curr).append(" ");

            for(int next = graph.length-1; next > 0; next--){
                if(!visited[next] && graph[curr][next] != 0){
                    mystack.push(next);
                }
            }
        }
    }
}
