package Class1;

import java.io.*;

public class BOJ_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = br.readLine().charAt(0);

        bw.write(String.valueOf(input));
        bw.flush();
        bw.close();
    }
}
