package Class2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2751 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> sortedArray = new ArrayList<Integer>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++)
            sortedArray.add(Integer.parseInt(br.readLine()));

        Collections.sort(sortedArray);

        for(int i=0; i<sortedArray.size(); i++){
            sb.append(sortedArray.get(i)).append("\n");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();

    }
}
