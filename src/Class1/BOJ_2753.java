package Class1;

import java.io.*;

public class BOJ_2753 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int month = Integer.parseInt(br.readLine());

        int result = month % 4 == 0 ? (month % 100 != 0 || month % 400 == 0 ? 1 : 0) : 0;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }
}
