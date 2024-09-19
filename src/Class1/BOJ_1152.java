package Class1;

import java.io.*;

public class BOJ_1152 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().strip().split(" ");
        int count = s.length;

        if(s.length == 1 && s[0].isEmpty())
            count = 0;

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}
