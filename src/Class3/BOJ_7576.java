package Class3;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Tomato{
    int x;
    int y;
    int day;

    public Tomato(int x, int y, int day){
        this.x = x;
        this.y = y;
        this.day = day;
    }
}
public class BOJ_7576 {
    static int[][] graph;
    static boolean[][] visited;
    static Queue<Tomato> myQueue = new LinkedList<>();
    static int[][] direction = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new int[M][N];
        visited = new boolean[M][N];
        //배열에 토마토 상태 할당하기
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //토마토의 익힘 상태 확인
        boolean isAllRipe = true;

        Outer:for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(graph[i][j] == 0) {
                    isAllRipe = false;
                    break Outer;
                }
            }
        }
        int minDay = 0;
        //모든토마토가 익어있는 상태
        if(isAllRipe){
            System.out.print(0);
        }
        //그 이외
        if(!isAllRipe){
            for(int i=0; i<M; i++){
                for(int j=0; j<N; j++){
                    if(graph[i][j] == 1) {
                        myQueue.offer(new Tomato(i, j, 0));
                    }
                }
            }
            //모든 토마토가 익지 못하는 상태
            minDay = bfs();
            Outer:for(int i=0; i<M; i++){
                for(int j=0; j<N; j++){
                    if(graph[i][j] == 0) {
                        minDay = -1;
                        break Outer;
                    }
                }
            }

            System.out.print(minDay);
        }


    }

    static int bfs(){
        int day = 0;
        while(!myQueue.isEmpty()){
            Tomato curr = myQueue.poll();
            day = curr.day;

            if(visited[curr.x][curr.y])
                continue;
            visited[curr.x][curr.y] = true;

            for(int next=0; next <4; next++){
                int nextX = curr.x + direction[next][0];
                int nextY = curr.y + direction[next][1];

                if(nextX >= graph.length || nextX < 0 || nextY >=graph[0].length || nextY <0)
                    continue;
                if(!visited[nextX][nextY] && graph[nextX][nextY] == 0) {
                    graph[nextX][nextY] = 1;
                    myQueue.offer(new Tomato(nextX, nextY, curr.day + 1));
                }
            }
        }

        return day;
    }
}
