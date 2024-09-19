package Class1;

import java.io.*;

public class BOJ_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            String result = br.readLine();
            int plusScore = 1;
            int sum = 0;
            for(int j = 0; j < result.length(); j++) {
                if(result.charAt(j) == 'O')
                    sum += plusScore++;
                else
                    plusScore = 1;
            }
            sb.append(sum).append("\n");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
