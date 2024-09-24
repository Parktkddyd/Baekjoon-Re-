package Class2;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Comparator;

public class BOJ_11650 {
    public static class coordinate {
        int x, y;

        public coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        ArrayList<coordinate> arr_coordinate = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr_coordinate.add(new coordinate(x, y));
        }

        arr_coordinate.sort(new Comparator<coordinate>() {
            @Override
            public int compare(coordinate c1, coordinate c2) {
                if (c1.x == c2.x)
                    return c1.y - c2.y;

                return c1.x - c2.x;
            }
        });

        for (int i = 0; i < N; i++)
            sb.append(arr_coordinate.get(i).x).append(" ").append(arr_coordinate.get(i).y).append("\n");

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
