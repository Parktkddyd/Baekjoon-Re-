package Class2;

import java.io.*;
import java.util.*;

public class BOJ_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> sortedList = null;
        HashSet<String> hashSet = new HashSet<String>();

        int N = Integer.parseInt(br.readLine());

        while(N-->0){
            String str = br.readLine();
            hashSet.add(str);
        }
        sortedList = new ArrayList<String>(hashSet);
        sortedList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if(o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                }else{
                    return o1.compareTo(o2);
                }
            }
        });

        for(String str : sortedList){
            sb.append(str).append("\n");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();

    }
}
