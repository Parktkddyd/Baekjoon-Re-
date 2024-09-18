package Class1;

import java.io.*;

public class BOJ_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int idx = Integer.parseInt(br.readLine());
        char result = input.charAt(idx-1);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
