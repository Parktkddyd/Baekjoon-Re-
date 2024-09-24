package Class2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] chessboard = new String[N];

        for(int i=0; i<N; i++){
            chessboard[i] = br.readLine();
        }

        int result = Integer.MAX_VALUE;
        for(int i=0; i<=N-8; i++){
            for(int j=0; j<=M-8; j++){
                int count = GetMin(i, j, chessboard);
                if(result > count){
                    result = count;
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    public static int GetMin(int startRow, int startCol, String[] chessboard){
        String[] board = new String[]{"BWBWBWBW", "WBWBWBWB"};
        int BlackCount = 0;
        for(int i=0; i<8; i++){
            int row = startRow+i;
            for(int j=0; j<8; j++){
                int col = startCol +j;

                if(chessboard[row].charAt(col) != board[row%2].charAt(j)){
                    BlackCount++;
                }
            }
        }
        return Math.min(BlackCount, 64-BlackCount);
    }
}
