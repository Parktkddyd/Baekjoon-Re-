package Class1;

import java.io.*;

public class BOJ_31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] numArray = new String[3];

        for(int i=0; i<numArray.length; i++){
            numArray[i] = br.readLine();
        }

        int strSum = Integer.parseInt(numArray[0]+numArray[1]) - Integer.parseInt(numArray[2]);
        int intSum = Integer.parseInt(numArray[0]) + Integer.parseInt(numArray[1]) - Integer.parseInt(numArray[2]);

        sb.append(intSum).append("\n").append(strSum);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
