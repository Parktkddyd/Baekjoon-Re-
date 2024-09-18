package Class1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer strArr = new StringTokenizer(br.readLine());
        int[] numArr = new int[count];

        for(int i = 0; i < count; i++)
            numArr[i] = Integer.parseInt(strArr.nextToken());

        int max = numArr[0];
        int min = numArr[0];

        for(int j: numArr){
            if(j > max)
                max = j;

            if(j < min)
                min = j;
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();

    }
}
