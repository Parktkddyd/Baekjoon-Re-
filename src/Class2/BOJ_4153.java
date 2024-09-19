package Class2;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
public class BOJ_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while(true){
            String input = br.readLine();
            if(input.equals("0 0 0"))
                break;

            String[] s = input.split(" ");
            int[] n = new int[s.length];
            for(int i=0; i<s.length; i++){
                n[i] = Integer.parseInt(s[i]);
            }
            Arrays.sort(n);
            if(n[0]*n[0] + n[1]*n[1] == n[2]*n[2])
                sb.append("right").append("\n");
            else
                sb.append("wrong").append("\n");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
