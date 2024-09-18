package Class1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if(hour > 0 && hour <= 23) {
            if (minute >= 45)
                minute = minute - 45;
            else {
                hour = hour - 1;
                minute = 60 - (45 - minute);
            }
        }else{
            if(minute >= 45)
                minute = minute -45;
            else{
                hour = 23;
                minute = 60 - (45 - minute);
            }
        }

        bw.write(hour + " " + minute);
        bw.flush();
        bw.close();
    }
}
