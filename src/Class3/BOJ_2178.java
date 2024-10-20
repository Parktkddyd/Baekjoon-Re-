package Class3;

import java.io.*;
import java.util.*;

class My_Point{
    public int x;
    public int y;
    public int depth;
    public My_Point(int x, int y, int depth){
        this.x = x;
        this.y = y;
        this.depth = depth;
    }
}

public class BOJ_2178 {
    static int[][] graph;
    static int N;
    static int M;
    static boolean[][] visited;
    static int[][] direction = {{-1,0}, {1,0}, {0,-1}, {0,1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                graph[i][j] = str.charAt(j) -'0';
            }
        }

        int result = flood_fill(new My_Point(0,0, 1)); //출발지 (1,1)부터 Stack에 들어가기 때문에 시작depth = 0;
        System.out.print(result);
    }

    static int flood_fill(My_Point myPoint){
        visited = new boolean[N][M];
        Queue<My_Point> myQueue = new LinkedList<>();
        My_Point curr = myPoint;

        myQueue.offer(curr);
        int step = Integer.MAX_VALUE;
        while(!myQueue.isEmpty()){
            curr = myQueue.poll();

            if(visited[curr.x][curr.y])
                continue;
            visited[curr.x][curr.y] = true;

            for(int next = 0; next<4; next++){
                int nextX = curr.x+direction[next][0]; int nextY = curr.y+direction[next][1];
                if(nextX <0 || nextX >=N || nextY<0 || nextY>=M){
                    continue;
                }
                if(visited[nextX][nextY] || graph[nextX][nextY] == 0)
                    continue;

                //상하좌우 어느방향으로 이동하던간에, 결국 최종 목적지까지 가기위한 한걸음일뿐
                myQueue.offer(new My_Point(nextX, nextY, curr.depth+1));
            }
            if(curr.x == N-1 && curr.y == M-1){
                step = Math.min(step, curr.depth);
            }
        }
        return step;
    }
}
