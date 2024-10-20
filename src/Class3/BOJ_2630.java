package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2630 {
    static int blue = 0;
    static int white = 0;
    static int[][] numArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        numArr = new int[N][N];
        for (int i = 0; i < numArr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < numArr[i].length; j++) {
                numArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        //재귀 호출, 메소드 1.
        recursive(0, 0, N);
        //줄인 크기만큼 탐색하는 메소드1

        System.out.println(white);
        System.out.print(blue);

    }
    public static void recursive(int row, int col, int N){

        if(search(row, col, N)){
            if(numArr[row][col] == 1){
                blue++;
            }else{
                white++;
            }

            return;
        }

        N = N/2;


        recursive(row, col+N, N);
        recursive(row, col, N);
        recursive(row+N, col, N);
        recursive(row+N, col+N, N);
    }


    public static boolean search(int row, int col, int N){
        int first = numArr[row][col];

        for(int i= row; i<row+N; i++){
            for(int j=col; j<col+N; j++){
                if(numArr[i][j] != first)
                    return false;
            }
        }

        return true;
    }
}
