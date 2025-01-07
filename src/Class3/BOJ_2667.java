package Class3;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class BOJ_2667 {
    static int[][] graph;
    static boolean[][] visited;
    static int[][] direction = {{-1,0}, {1,0}, {0,-1}, {0,1}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        graph = new int[N][N];
        visited = new boolean[N][N];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(visited[i][j] || graph[i][j] == 0)
                    continue;
                count = floodFill(i, j);
                list.add(count);
            }
        }
        Collections.sort(list);

        System.out.println(list.size());
        for(int i : list)
            System.out.println(i);
    }

    public static int floodFill(int i, int j){
        ArrayList<Integer> curr = new ArrayList<>();
        int count = 0;

        curr.add(i);
        curr.add(j);

        Stack<ArrayList<Integer>> myStack = new Stack<>();
        myStack.add(curr);

        while(!myStack.isEmpty()){
            curr = myStack.pop();

            if(visited[curr.get(0)][curr.get(1)])
                continue;
            visited[curr.get(0)][curr.get(1)] = true;
            //방문하지 않았다면 count 증가
            count++;
            
            for(int next = 0; next<4; next++){
                int nextX = curr.get(0)+direction[next][0];
                int nextY = curr.get(1)+direction[next][1];

                if(nextX <0 || nextX >= graph.length || nextY <0 || nextY>=graph.length)
                    continue;

                if(visited[nextX][nextY] ||graph[nextX][nextY] == 0)
                    continue;

                ArrayList<Integer> nextNode = new ArrayList<>();
                nextNode.add(nextX); nextNode.add(nextY);
                myStack.push(nextNode);
            }
        }

        return count;
    }

}
