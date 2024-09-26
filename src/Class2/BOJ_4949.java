package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_4949 {
    public static void main(String[] args) throws IOException {
        //stack 사용하는 문제.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        while((s = br.readLine()) != null) {
            if(s.equals("."))
                break;

            stack.clear();


            boolean flag = false;

            for(int i=0; i<s.length(); i++){
                if( s.charAt(i) == '(' || s.charAt(i) == '['){
                    stack.push(s.charAt(i));
                    }


                if(s.charAt(i) == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(')
                        stack.pop();
                    else
                        flag = true;
                } else if(s.charAt(i) == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[')
                        stack.pop();
                    else
                        flag = true;
                }
            }

            if(stack.isEmpty() && !flag)
                sb.append("yes").append("\n");
            else
                sb.append("no").append("\n");
        }

        System.out.print(sb.toString().trim());
    }
}
