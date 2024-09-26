package Class2;
import java.io.*;
import java.util.*;

public class BOJ_2839 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = N/5;
        int sum = 0;

        while(count >= 0){
            //5로 나누어 떨어지면, 그대로 sum에 누적해서 출력
            //아닐경우 count를 하나씩 줄여가며 3으로 나눠준 값 더해주기.
            if(N%5 == 0){
                sum += count; break;
            }else{
                int value = (N - (count*5))/3;
                int remain = (N - (count*5))%3;
                if(remain ==0) {
                    sum += (value + count);
                    break;
                }
            }
            count--;
        }

        if(sum == 0)
            System.out.print("-1");
        else
            System.out.print(sum);

    }
}
