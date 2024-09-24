package Class2;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
public class BOJ_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        ArrayList<String[]> strArr = new ArrayList<>();

        for(int i=0; i<N; i++){
            String[] info = br.readLine().split(" ");
            strArr.add(info);
        }

        strArr.sort(new Comparator<String[]>(){
            @Override
            public int compare(String[] o1, String[] o2){
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for(int i=0; i<strArr.size(); i++)
            sb.append(strArr.get(i)[0]).append(" ").append(strArr.get(i)[1]).append("\n");

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();

    }
}
