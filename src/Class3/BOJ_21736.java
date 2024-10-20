package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class MyLoc{
    public int x;
    public int y;

    MyLoc(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class BOJ_21736 {
    static char[][] field;
    static boolean[][] visited;
    static int[][] direction = {{-1, 0}, {1,0}, {0,-1}, {0,1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        field = new char[N][M];
        visited = new boolean[N][M];

        MyLoc myLoc = null;

        for(int i=0; i<N; i++){
            String line = br.readLine();
            for(int j=0; j<M; j++){
                field[i][j] = line.charAt(j);
                if(field[i][j] == 'I'){
                    myLoc = new MyLoc(i,j);
                }
            }
        }

        bfs(myLoc);
        int result = 0;
        for(int i=0; i<visited.length; i++){
            for(int j=0; j<visited[0].length; j++) {
                if(visited[i][j] && field[i][j] == 'P')
                    result++;
            }
        }

        if(result > 0){
            System.out.print(result);
        }else{
            System.out.print("TT");
        }

    }

    static void bfs(MyLoc myLoc){
        MyLoc curr = myLoc;
        Stack<MyLoc> myStack = new Stack<>();

        myStack.add(curr);

        while(!myStack.isEmpty()){
            curr = myStack.pop();

            if(visited[curr.x][curr.y])
                continue;

            visited[curr.x][curr.y] = true;

            for(int next = 0; next < 4; next++){
                //상하좌우 -1,0 1,0, 0,-1, 0,1 기준으로 탐색
                int nextX = curr.x+direction[next][0];
                int nextY = curr.y+direction[next][1];
                //필드의 범위를 넘어서면 continue;
                if(nextX < 0 || nextX >= field.length || nextY < 0 || nextY >= field[0].length){
                    continue;
                }

                //이미 방문한 적이 있으면 생략
                if(visited[nextX][nextY])
                    continue;

                // 벽으로 막혀있으면 생략
                if(field[nextX][nextY] == 'X') {
                    continue;
                }

                //아니면 스택에 쌓기
                myStack.push(new MyLoc(nextX, nextY));

            }

        }
    }
}
