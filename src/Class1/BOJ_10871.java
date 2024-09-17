package Class1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st1 = new StringTokenizer(br.readLine()); // N과 X
        StringTokenizer st2 = new StringTokenizer(br.readLine()); // N개의 수열 A

        int N = Integer.parseInt(st1.nextToken());
        int X = Integer.parseInt(st1.nextToken());


        while(st2.hasMoreTokens()){
            int component = Integer.parseInt(st2.nextToken());
            if(component < X)
                sb.append(component).append(" ");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
