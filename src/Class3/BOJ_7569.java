package Class3;

import java.io.*;
import java.util.*;

class MyNewPoint{
    int x;
    int y;
    int z;
    int depth;
    public MyNewPoint(int x, int y, int z, int depth){
        this.x = x;
        this.y = y;
        this.z = z;
        this.depth = depth;
    }
}
public class BOJ_7569 {
    static int M;
    static int N;
    static int H;
    static int[][][] graph;
    static boolean[][][] visited;
    static Queue<MyNewPoint> myQueue = new LinkedList<>();
    static int[][] direction = {{-1,0,0}, {1,0,0}, {0,-1,0}, {0,1,0}, {0,0,-1}, {0,0,1}};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        boolean flag = false;
        graph = new int[H][N][M];
        visited = new boolean[H][N][M];

        for(int i=0; i<H; i++){
            for(int j=0; j<N; j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<M; k++){
                    graph[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }

        flag = status();

        if(flag){
            for(int i=0; i<H; i++){
                for(int j=0; j<N; j++){
                    for(int k=0; k<M; k++){
                        if(graph[i][j][k] == 1) {
                            myQueue.offer(new MyNewPoint(i,j,k,0));
                        }
                    }
                }
            }
            int res = bfs();

            for(int i=0; i<H; i++){
                for(int j=0; j<N; j++){
                    for(int k=0; k<M; k++){
                        if(graph[i][j][k] == 0) {
                            System.out.print(-1);
                            return;
                        }
                    }
                }
            }
            System.out.println(res);

        }else{
            System.out.print(0);
        }
    }
    public static boolean status(){
        for(int i=0; i<H; i++){
            for(int j=0; j<N; j++){
                for(int k=0; k<M; k++){
                    if(graph[i][j][k] == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static int bfs(){
        int result = 0;

        while(!myQueue.isEmpty()){
            MyNewPoint curr = myQueue.poll();
            if(visited[curr.x][curr.y][curr.z])
                continue;
            visited[curr.x][curr.y][curr.z] = true;
            result = curr.depth;

            for(int i=0; i<6; i++){
                int nextX = curr.x + direction[i][0];
                int nextY = curr.y + direction[i][1];
                int nextZ = curr.z + direction[i][2];

                if(nextX >= H || nextX <0 || nextY >= N || nextY <0 || nextZ >= M || nextZ < 0){
                    continue;
                }
                if(!visited[nextX][nextY][nextZ] && graph[nextX][nextY][nextZ] == 0){
                    graph[nextX][nextY][nextZ] = 1;
                    myQueue.offer(new MyNewPoint(nextX, nextY, nextZ, curr.depth+1));
                }
            }
        }

        return result;
    }
}
