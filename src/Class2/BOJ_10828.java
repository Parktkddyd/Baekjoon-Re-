package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_10828 {
    static ArrayList<Integer> stack = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String[] cmdLine = br.readLine().split(" ");

            switch(cmdLine[0]){
                case "push" :
                    int number = Integer.parseInt(cmdLine[1]);
                    push(number); break;
                case "pop" : sb.append(pop()).append("\n"); break;
                case "size" : sb.append(size()).append("\n"); break;
                case "empty" : sb.append(empty()).append("\n"); break;
                case "top" : sb.append(top()).append("\n"); break;
                default : break;
            }
        }
        System.out.print(sb.toString().trim());
    }

    private static int top() {
        if(!stack.isEmpty())
            return stack.get(stack.size()-1);
        else
            return -1;
    }

    private static int empty() {
        if(stack.isEmpty())
            return 1;
        else
            return 0;
    }

    private static int size() {
        if(!stack.isEmpty())
            return stack.size();
        else
           return 0;
    }

    private static int pop() {
        if(!stack.isEmpty()) {
            int top = top();
            stack.remove(stack.size()-1);
            return top;
        }else{
            return -1;
        }
    }

    private static void push(int number) {
        stack.add(number);
    }
}
