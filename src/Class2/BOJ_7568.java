package Class2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n+1][n+1];
        int[] rank = new int[n+1];
        for(int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[0][i] = Integer.parseInt(st.nextToken());
            rank[i] = 1;
        }

        for(int i=1; i<=n; i++){
            for(int j=i+1; j<=n; j++) {
                if ((arr[i][0] - arr[j][0]) > 0 && arr[0][i] - arr[0][j] > 0) {
                    rank[j]++;
                } else {
                    if ((arr[i][0] - arr[j][0]) < 0 && arr[0][i] - arr[0][j] < 0) {
                        rank[i]++;
                    }
                }
            }
        }

        for(int i=1; i<=n; i++){
            System.out.println(rank[i]);
        }
    }
}
