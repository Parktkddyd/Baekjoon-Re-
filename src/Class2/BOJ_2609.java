package Class2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int idx = 2;
        int lcm = 1;
        int gcd = 1;

        while(num1/idx > 0 && num2/idx > 0){
            if(num1 % idx == 0 && num2 % idx ==0)
                gcd = gcd*idx;
            else {
                idx++;
                continue;
            }
            num1 = num1 / idx;
            num2 = num2 / idx;
        }

        lcm = gcd * num1 * num2;

        bw.write(String.valueOf(gcd));
        bw.newLine();
        bw.write(String.valueOf(lcm));
        bw.flush();
        bw.close();
        }
}
