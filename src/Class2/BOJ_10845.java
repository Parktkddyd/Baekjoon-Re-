package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10845 {

    static Stack<Integer> st1 = new Stack<>();
    static Stack<Integer> st2 = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String[] cmd = br.readLine().split(" ");

            switch(cmd[0]){
                case "push":
                    int number = Integer.parseInt(cmd[1]);
                    push(number); break;
                case "pop" : sb.append(pop()).append("\n"); break;
                case "size" : sb.append(size()).append("\n"); break;
                case "empty" : sb.append(empty()).append("\n"); break;
                case "front" : sb.append(front()).append("\n"); break;
                case "back" : sb.append(back()).append("\n"); break;
                default: break;
            }
        }
        System.out.print(sb.toString().trim());
    }

    public static void push(int number){
        st1.push(number);
    }

    public static int pop(){
        if(!st1.empty()) {
            while (!st1.empty()) {
                st2.push(st1.pop());
            }
            int pop = st2.pop();

            while (!st2.empty()) {
                st1.push(st2.pop());
            }
            return pop;
        }

        return -1;
    }

    public static int size(){
        return st1.size();
    }

    public static int empty(){
        if(!st1.isEmpty())
            return 0;
        return 1;
    }

    public static int front(){
        if(!st1.isEmpty()){
            while(!st1.isEmpty()) {
                st2.add(st1.pop());
            }
            int peek = st2.peek();
            while(!st2.isEmpty()){
                st1.add(st2.pop());
            }
            return peek;
        }
        return -1;
    }

    public static int back(){
        if(!st1.isEmpty())
            return st1.peek();
        return -1;
    }
}
