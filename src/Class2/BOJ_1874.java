package Class2;

import java.io.*;
import java.util.*;

public class BOJ_1874 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] originArray = new int[N];
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0; i<N; i++){
            originArray[i] = Integer.parseInt(br.readLine());
        }

        int idx = 1;
        int pointer = 0;

        while(true){
            if(stack.isEmpty()){
                stack.add(idx++);
                sb.append("+").append("\n");
            }else{
                if(stack.peek() == originArray[pointer]){
                    stack.pop();
                    pointer++;
                    sb.append("-").append("\n");
                }else if(stack.peek() < originArray[pointer]){
                    stack.push(idx++);
                    sb.append("+").append("\n");
                }else{
                    break;
                }
            }

            if(pointer == (originArray.length))
                break;
        }

        if(!stack.isEmpty()){
            System.out.print("NO");
        }else{
            System.out.print(sb.toString().trim());
        }
    }
}
