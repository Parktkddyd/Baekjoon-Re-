package Class1;

import java.io.*;
import java.util.Arrays;

public class BOJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        String input = br.readLine();

        for(int i=0; i<input.length(); i++) {
            int alphaIdx = input.charAt(i)-'a';
            if(alphabet[alphaIdx] == -1)
                alphabet[alphaIdx] = i;
        }

        for(int i=0; i<alphabet.length; i++) {
            sb.append(alphabet[i]).append(" ");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();


    }
}
