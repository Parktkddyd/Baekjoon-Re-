package Class3;

import java.io.*;
import java.util.Stack;

public class BOJ_11403 {
    static int[][] firstGraph;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //정점의 개수
        int N = Integer.parseInt(br.readLine());
        firstGraph = new int[N][N];

        for(int i=0; i<N; i++){
            String[] str = br.readLine().split(" ");
            for(int j=0; j<N; j++){
                //처음 방향 그래프
                firstGraph[i][j] = Integer.parseInt(str[j]);
            }
        }

        //모든 정점에 대하여 깊이 탐색을 진행하고. 해당 점을 지날 때 마다 결과 그래프의 좌표에 1을 할당.
        floydWarshall(N);

        for(int i=0; i< firstGraph.length; i++){
            for(int j=0; j< firstGraph.length; j++){
                System.out.print(firstGraph[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void floydWarshall(int n){

        for(int k=0; k<n; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(firstGraph[i][k] == 1 && firstGraph[k][j] == 1)
                        firstGraph[i][j] = 1;
                }
            }
        }
    }
}
