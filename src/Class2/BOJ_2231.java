package Class2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2231 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int numDigits = str.length();
        int num = Integer.parseInt(str);

        int min = num - (numDigits * 9);

        int result = 0;

        for(int i=min; i<num; i++){
            int sum = 0;
            int component = i;

            while(component > 0){
                sum += component%10;
                component/=10;
            }
            if(sum+i == num){
                result = i;
                break;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
