package Class3;

import java.io.*;
import java.util.*;

public class BOJ_11723 {
    static HashSet<Integer> hashSet = new HashSet<>();
    static HashSet<Integer> allSet = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i =1; i<=20; i++){
            allSet.add(i);
        }

        for(int i=0; i<N; i++){
            String[] cmd = br.readLine().split(" ");
            int num = 0;
            if(cmd.length > 1){
                num = Integer.parseInt(cmd[1]);
            }
            switch(cmd[0]){
                case "add" : add(num); break;
                case "remove" : remove(num); break;
                case "check" : sb.append(check(num)).append("\n"); break;
                case "toggle" : toggle(num); break;
                case "all" : all(allSet); break;
                case "empty" : empty(); break;
                default : break;
            }
        }

        System.out.print(sb.toString().trim());
    }

    private static void empty() {
        hashSet.clear();
    }

    private static void all(HashSet<Integer> set) {

        hashSet.addAll(allSet);
    }

    private static void toggle(int n) {
        if(hashSet.contains(n)){
            hashSet.remove(n);
        }else{
            hashSet.add(n);
        }
    }

    private static int check(int n) {
        if(hashSet.contains(n))
            return 1;
        else
            return 0;
    }

    private static void remove(int n) {
        hashSet.remove(n);
    }

    private static void add(int n) {
        hashSet.add(n);
    }
}
