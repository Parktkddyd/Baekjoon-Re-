package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String formula = br.readLine();

        String[] split = formula.split("-");

        int sum = 0;

        for(int i=0; i<split.length; i++) {
            StringTokenizer st = new StringTokenizer(split[i], "+");
            int temp = 0;
            while (st.hasMoreTokens()) {
                temp += Integer.parseInt(st.nextToken());
            }

            if(i==0){
                sum += temp;
            }else{
                sum -= temp;
            }
        }

        System.out.print(sum);
    }
}
