package Class1;

import java.io.*;

public class BOJ_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int count = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int result = 0;

        for(int i=0; i<count; i++){
            result += (input.charAt(i) - '0');
        }


        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
