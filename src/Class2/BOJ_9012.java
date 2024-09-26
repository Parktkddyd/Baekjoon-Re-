package Class2;

import java.io.*;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> st  =new Stack<>();
        int T = Integer.parseInt(br.readLine());
        String str = "";
        boolean flag;

        for(int i=0; i<T; i++){
            st.clear();
            str = br.readLine();
            flag = true;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == '(' || str.charAt(j) == '[')
                    st.push(str.charAt(j));

                if(!st.isEmpty()){
                    if(str.charAt(j) ==')' && st.peek() == '(' || str.charAt(j) ==']' && st.peek() == '[')
                        st.pop();
                }else{
                    flag = false;
                }
            }

            if(!st.isEmpty() || !flag)
                sb.append("NO").append("\n");
            else
                sb.append("YES").append("\n");
        }

        System.out.print(sb.toString().trim());
    }
}
