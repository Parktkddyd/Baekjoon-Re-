package Class2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_2164 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        //처음 카드를 담을 스택
        Queue<Integer> q1 = new LinkedList<>();
        //남은 카드를 보관하는 스택
        for(int i=1; i<=N; i++){
            q1.add(i);
        }

        int remain = 0;
        while(!q1.isEmpty()){
            if(q1.size() ==1){
                remain = q1.poll();
                break;
            }

            q1.poll();
            q1.add(q1.poll());
        }

        System.out.println(remain);
    }
}
