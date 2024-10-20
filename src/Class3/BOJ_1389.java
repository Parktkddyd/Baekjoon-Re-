package Class3;

import java.io.*;
import java.util.*;

class MyPoint{
    int node;
    int depth;

    MyPoint(int node, int depth){
        this.node = node;
        this.depth = depth;
    }
}
public class BOJ_1389 {
    static int[][] field;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        field = new int[N+1][N+1];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());
            field[first][last] = 1;
            field[last][first] = 1;
        }

        int min = Integer.MAX_VALUE;
        int minIdx = -1;
        for(int i=1; i<=N; i++){
            int temp = dfs(i);
            if(temp < min) {
                min = dfs(i);
                minIdx = i;
            }
        }
        System.out.print(minIdx);
    }

    public static int dfs(int node){
        boolean[] visited = new boolean[field.length];
        Queue<MyPoint> myQueue = new LinkedList<>();
        int sum = 0;

        MyPoint curr = new MyPoint(node,0);


        myQueue.offer(curr);

        while(!myQueue.isEmpty()){
            curr = myQueue.poll();
            if(visited[curr.node])
                continue;

            visited[curr.node] =true;
            sum+= curr.depth;

            for(int next = 1; next<field[0].length; next++){
                if(!visited[next] && field[curr.node][next] == 1){
                    MyPoint nextPoint = new MyPoint(next, curr.depth+1);
                    myQueue.offer(nextPoint);
                }
            }
        }
        return sum;
    }
}
