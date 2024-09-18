package Class1;

import java.io.*;

public class BOJ_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int max = Integer.parseInt(br.readLine());
        int maxIdx = 1;

        for(int i=2; i<=9; i++){
            int temp = Integer.parseInt(br.readLine());
            if(max < temp){
                max = temp;
                maxIdx = i;
            }
        }

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(maxIdx));
        bw.flush();
        bw.close();

    }
}
