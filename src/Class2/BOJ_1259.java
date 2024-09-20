package Class2;

import java.io.*;

public class BOJ_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String s = br.readLine();
            String result = "no";
            if(s.equals("0"))
                break;

            if(s.length() > 1) {
                for (int i = 0; i < s.length() / 2; i++) {
                    char start = s.charAt(i);
                    char end = s.charAt((s.length() - 1) - i);
                    if (start != end) {
                        result = "no";
                        sb.append(result).append("\n");
                        break;
                    } else {
                        result = "yes";
                    }
                }
            }else{
                result = "yes";
            }

            if(result.equals("yes"))
                sb.append(result).append("\n");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
