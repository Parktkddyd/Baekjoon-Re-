package Class1;

import java.io.*;

public class BOJ_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int[] n = new int[8];
        for (int i=0; i<s.length; i++) {
            n[i] = Integer.parseInt(s[i]);
        }

        boolean asc = false;
        boolean dsc = false;

        int temp = n[0];

        for (int i=1; i<n.length; i++) {
            if (temp < n[i]) {
                temp = n[i];
                asc = true;
            } else {
                temp = n[i];
                dsc = true;
            }
        }

        if(asc && dsc)
            bw.write("mixed");
        else{
            if(!asc){
                bw.write("descending");
            }else{
                bw.write("ascending");
            }
        }

        bw.flush();
        bw.close();

    }
}
