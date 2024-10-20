package Class3;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Location{
    int x;
    int depth;

    public Location(int x, int depth){
        this.x = x;
        this.depth = depth;
    }
}
public class BOJ_1697 {
    static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        bfs(N,K);

        System.out.println(result);
    }

    static void bfs(int start, int end){
        if(start == end){
            result = 0;
        }else {
            Location curr = new Location(start, 0);
            Queue<Location> myQueue = new LinkedList<>();
            boolean[] visited = new boolean[100001];

            myQueue.offer(curr);

            while (!myQueue.isEmpty()) {
                curr = myQueue.poll();

                if (visited[curr.x]) {
                    continue;
                }
                visited[curr.x] = true;

                Location nextLocation1 = new Location(curr.x - 1, curr.depth + 1);
                Location nextLocation2 = new Location(curr.x + 1, curr.depth + 1);
                Location nextLocation3 = new Location(curr.x * 2, curr.depth + 1);

                if (nextLocation1.x >= 0 && !visited[nextLocation1.x]) {
                    myQueue.offer(nextLocation1);
                }

                if (nextLocation2.x >= 0 && nextLocation3.x < visited.length && !visited[nextLocation2.x]) {
                    myQueue.offer(nextLocation2);
                }

                if (nextLocation3.x >= 0 && nextLocation3.x < visited.length && !visited[nextLocation3.x]) {
                    myQueue.offer(nextLocation3);
                }


                if (nextLocation1.x == end) {
                    result = Math.min(result, nextLocation1.depth);
                    break;
                }
                if (nextLocation2.x == end) {
                    result = Math.min(result, nextLocation2.depth);
                    break;
                }
                if (nextLocation3.x == end) {
                    result = Math.min(result, nextLocation3.depth);
                    break;
                }
            }

        }
    }
}
