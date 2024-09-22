package Class2;

import java.io.*;

public class BOJ_2775 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());

            int[][] arr = new int[floor+1][room+1];

            for (int j = 1; j <= room; j++) {
                arr[0][j] = j;
            }

            for (int k = 1; k <= floor; k++) {
                for (int l = 1; l <= room; l++) {
                    arr[k][l] = arr[k - 1][l] + arr[k][l - 1];
                }
            }

            int persons = arr[floor][room];

            bw.write(persons + "\n");
        }
        bw.flush();
        bw.close();
    }
}
