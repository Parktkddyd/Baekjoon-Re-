package Class2;

import java.io.*;
import java.util.*;

public class BOJ_1966 {
    public static class Component implements Comparable<Component>{
        private final int priority;
        private final int index;

        public Component(int priority, int index){
            this.priority = priority;
            this.index = index;
        }


        //Integer.compare 메소드는 두 파라미터를 비교하는데, 그 값이 같을경우 0을 반환 아닐경우 각각 1, -1을 반환한다.
        @Override
        public int compareTo(Component o) {
            return Integer.compare(this.priority, o.priority);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue<Component> originQueue = new LinkedList<>();

        int TC = Integer.parseInt(br.readLine());

        while(TC-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int totalNum = Integer.parseInt(st.nextToken());
            int docNum = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            for(int i=0; i<totalNum; i++){
                //Component 객체를 생성하여 중요도와 인덱스를 담은 뒤, 큐에 삽입한다.
                Component component = new Component(Integer.parseInt(st.nextToken()), i);
                originQueue.add(component);
            }


            //가장 중요도가 높은 인덱스의 인쇄 순번은 1부터 시작한다. 그러므로 order 값은 1로 초기화가 된다.
            int order = 1;

            //큐안에 원소가 있다면 while문 안에 있는 내용을 큐가 비워질 때 까지 반복한다.
            while(!originQueue.isEmpty()){
                //Collections.max는 Collection의 원소중 최댓값을 반환하는 메소드이다. 큐 안에 들어있는 원소는 Component 객체이므로
                // max의 Component 객체에 Comparable 인터페이스를 상속하고, Comparabale 객체에 있는 compareTo 메소드를 오버라이딩 하여,
                //Component의 중요도에 따른 비교가 가능하도록 한다.
                //그 후 max값에 비교한 중요도값을 할당한다.
               int max = Collections.max(originQueue).priority;

               //curDoc 변수는 현재 큐에 가장 앞에 있는 원소를 의미한다.
               Component curDoc = originQueue.poll();
               int curPriority = curDoc.priority;
               int curIdx = curDoc.index;

                //가장 앞에 있는 원소의 중요도가 가장 높고, 그 원소가 찾고자 하는 인덱스를 가진 원소라면, order값을 출력하고, 다음 줄을 수행하기 위해 큐를 비워준다.
               if(curPriority == max) {
                   if (curIdx == docNum) {
                       sb.append(order).append("\n");
                       originQueue.clear();
                       break;
                   }
                   // 최댓값은 맞지만, 찾고자 하는 인덱스가 아니라면 큐에서 제거한 뒤 순번 값만 1 증가시킨다.
                   order++;
               }else{
                   // 최댓값이 아니라면 큐에 맨 뒤에 다시 삽입한다.
                    originQueue.add(curDoc);
               }
            }

        }

        System.out.print(sb.toString().trim());
    }
}
