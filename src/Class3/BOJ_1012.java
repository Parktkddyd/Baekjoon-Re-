package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Point{
    final int x;
    final int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class BOJ_1012 {
    static int width;
    static int height;
    static int count;
    static int[][] graph;
    static boolean[][] visited;
    static int[][] D = {{-1,0}, {1,0}, {0,-1}, {0,1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());


        while(T-->0) {
            //Test case 마다 width, height, count, graph 다 다름.
            StringTokenizer st = new StringTokenizer(br.readLine());
            width = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());
            count = Integer.parseInt(st.nextToken());
            graph = new int[width][height];
            visited = new boolean[width][height];

            for (int i = 0; i < count; i++) {
                st = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(st.nextToken());
                int last = Integer.parseInt(st.nextToken());

                graph[first][last] = 1;
            }
            int warms = 0;
            for(int i=0; i<width; i++){
                for(int j=0; j<height; j++){
                    if(graph[i][j] == 1 && !visited[i][j]){

                        //배추가 심어진 첫 지점에서 부터 dfs를 통해, 지렁이가 이동할 수 있는 영역을 모두 탐색한다.
                        //반복문을 순회하되, 이미 탐색을 통해 방문한 위치에서는 지렁이가 더 있을 필요가 없으므로,
                        //방문하지 않은 최초의 지점에서만 지렁이의 count를 1씩 더해주는 방식이다.
                        Point point = new Point(i,j);
                        dfs(point);
                        warms++;
                    }
                }
            }

            sb.append(warms).append("\n");
        }
        System.out.print(sb.toString().trim());

    }

    private static void dfs(Point point) {
        Stack<Point> myStack = new Stack<>();

        myStack.push(point);

        while(!myStack.isEmpty()){
            Point curr = myStack.pop();

            if(visited[curr.x][curr.y]){
                continue;
            }
            visited[curr.x][curr.y] = true;



            for(int next = 0; next<4; next++){
                //상하좌우 각각의 index가 배열 D의 원소 [0][0], [0][1] / [1][0], [1][1] / [2][0], [2,1] / [3][0], [3][1]  총 4방향이다.
                int nextX = curr.x+D[next][0]; int nextY = curr.y+D[next][1];

                //4방향 탐색을 하되, 탐색 범위는 그래프의 가로 세로 범위를 넘어서는 안되므로, 넘었을 시에 continue를 수행한다.
                if(nextX < 0 || nextX >= width || nextY < 0 || nextY >= height) continue;
                //만일 이미 방문한 위치라면 탐색을 하지 않는다.
                if(visited[nextX][nextY]) continue;
                //배추가 심어져 있지 않는 위치라면 탐색을 수행하지 않는다.
                if(graph[nextX][nextY] == 0)continue;

                //위의 모든 조건을 만족하면 stack에 해당 위치를 삽입하여 탐색한다.
                myStack.push(new Point(nextX, nextY));
            }
        }
    }


}
