package Class3;

import java.io.*;
import java.util.*;

public class BOJ_2606 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int counts = Integer.parseInt(br.readLine());
        int lines = Integer.parseInt(br.readLine());
        int[][] adjacencyMatrix = new int[counts+1][counts+1];

        for(int i=1; i<=lines; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int parentCom = Integer.parseInt(st.nextToken());
            int childCom = Integer.parseInt(st.nextToken());

            adjacencyMatrix[parentCom][childCom] = 1;
            adjacencyMatrix[childCom][parentCom] = 1;
         }
        int result;

        result = dfs(1, adjacencyMatrix);

        System.out.print(result);
}

    private static int dfs(int node, int[][] adjacencyMatrix) {
        boolean[] visited = new boolean[adjacencyMatrix.length];
        int result = 0;
        Stack<Integer> myStack = new Stack<>();
        myStack.add(node);
        while(!myStack.isEmpty()){
            int curr = myStack.pop();

            //방문했으면, continue
            if(visited[curr]){
                continue;
            }

            visited[curr] = true;
            result++;

            for(int next = 1; next < adjacencyMatrix.length; next++){
                if(!visited[next] && adjacencyMatrix[curr][next] != 0){
                    myStack.push(next);
                }
            }
        }


        //1번 컴퓨터는 제외 이므로 -1
        return result-1;
    }

}