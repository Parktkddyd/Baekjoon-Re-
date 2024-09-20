package Class2;

import java.io.*;

public class BOJ_2292{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int result = 0;

        int depth=0;
        int max = 1;
        while(true){
            int step = 6*depth;
            max += step;
            result++;
            if(max >= N)
                break;
            depth++;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
