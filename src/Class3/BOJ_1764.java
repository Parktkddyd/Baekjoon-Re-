package Class3;

import java.io.*;
import java.util.*;

public class BOJ_1764 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i=0; i<N; i++){
            String name = br.readLine();
            hashMap.put(name, 1);
        }

        for(int i=0; i<M; i++){
            String name = br.readLine();
            hashMap.put(name, hashMap.getOrDefault(name, 0)+1);
        }

        ArrayList<String> nameList;
        nameList = getName(hashMap, 2);

        Collections.sort(nameList);
        sb.append(nameList.size()).append("\n");
        for (String s : nameList) {
            sb.append(s).append("\n");
        }
        System.out.print(sb.toString().trim());
    }

    public static <K,V> ArrayList<K> getName(HashMap<K,V>hashMap, Integer value){
        ArrayList<K> nameList = new ArrayList<>();

        for(K key : hashMap.keySet()){
            if(value > 1){
                if(value.equals(hashMap.get(key))){
                    nameList.add(key);
                }
            }
        }
        return nameList;
    }
}
