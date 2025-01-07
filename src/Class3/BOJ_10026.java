package Class3;

import java.io.*;
import java.util.Stack;

public class BOJ_10026 {
    static char[][] rgbGraph;
    static boolean[][] rgbVisited;
    static boolean[][] rgVisited;
    static int[][] direction = {{-1,0}, {1,0}, {0,-1}, {0,1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        rgbGraph = new char[N][N];

        for(int i=0; i<N; i++){
            String s = br.readLine();
            for(int j=0; j<N; j++){
                rgbGraph[i][j] = s.charAt(j);
            }
        }

        int rgb = 0;
        int rg = 0;
        rgbVisited = new boolean[N][N];
        rgVisited = new boolean[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(rgbVisited[i][j])
                    continue;
                rgb++;
                rgbDfs(i,j, 0);
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(rgVisited[i][j])
                    continue;
                rg++;
                rgbDfs(i,j, 1);
            }
        }

        System.out.print(rgb + " " + rg);
    }

    public static void rgbDfs(int i, int j, int mode){
        int[] curr = {i,j};
        Stack<int[]> myStack = new Stack<>();
        myStack.push(curr);

        boolean[][] targetVisited;
        if(mode == 0)
            targetVisited = rgbVisited;
        else
            targetVisited = rgVisited;

        while(!myStack.isEmpty()) {
            curr = myStack.pop();
            if (targetVisited[curr[0]][curr[1]])
                continue;
            targetVisited[curr[0]][curr[1]] = true;

            for (int next = 0; next < 4; next++) {
                int nextX = curr[0] + direction[next][0];
                int nextY = curr[1] + direction[next][1];
                if (nextX < 0 || nextX >= rgbGraph.length || nextY < 0 || nextY >= rgbGraph.length)
                    continue;
                if (!targetVisited[nextX][nextY]) {

                    //RGB 모두 인식 가능할 때
                    if(mode == 0 && rgbGraph[nextX][nextY] == rgbGraph[curr[0]][curr[1]]) {
                        int[] nextNode = {nextX, nextY};
                        myStack.push(nextNode);
                    }
                    //적록 색약일 때
                    if (mode ==1 &&
                            (rgbGraph[nextX][nextY] == rgbGraph[curr[0]][curr[1]] ||
                                    (rgbGraph[nextX][nextY] =='R' && rgbGraph[curr[0]][curr[1]] =='G') ||
                                    (rgbGraph[nextX][nextY] =='G' && rgbGraph[curr[0]][curr[1]] =='R'))){
                        int[] nextNode = {nextX, nextY};
                        myStack.push(nextNode);
                    }
                }
            }
        }
    }
}
