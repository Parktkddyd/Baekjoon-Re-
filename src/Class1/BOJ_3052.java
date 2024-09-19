package Class1;

import java.io.*;

public class BOJ_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] remain = new int[42];
        int result = 0;

        for(int i=0; i<10; i++){
            int remainIdx = (Integer.parseInt(br.readLine()) % 42);
            remain[remainIdx] ++;
        }

        for (int j : remain)
            if (j > 0)
                result++;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
