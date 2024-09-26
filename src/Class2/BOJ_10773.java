package Class2;

import java.io.*;
import java.util.Stack;

public class BOJ_10773 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();
        //스택 사용, 최종적으로 모든 수를 부른 뒤 스택에 남은 값을 다 더해주는 문제
        int num = 0;
        for(int i=0; i<N; i++){
            num = Integer.parseInt(br.readLine());
            if(num==0) {
                st.pop();
                continue;
            }
            st.add(num);
        }

        int sum =0;
        while(!st.isEmpty())
            sum+=st.pop();

        System.out.print(sum);
    }
}
