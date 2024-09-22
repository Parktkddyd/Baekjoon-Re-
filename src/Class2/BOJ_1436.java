package Class2;

import java.io.*;

public class BOJ_1436 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int number = 666;
        int count = 0;

        while(count != N){
            if(String.valueOf(number).contains("666")) {
                count++;
            }
            number++;
        }

        bw.write(String.valueOf(number-1));
        bw.newLine();
        bw.close();
    }
}
