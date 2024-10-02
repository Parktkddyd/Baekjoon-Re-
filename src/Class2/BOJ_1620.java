package Class2;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1620 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> nameMap = new HashMap<>();
        HashMap<String, Integer> numMap = new HashMap<>();

        for(int i=1; i<=N+M; i++){
            if(i <=N){
                String name = br.readLine();
                nameMap.put(i, name);
                numMap.put(name, i);
            }

            if(i>N && i<=N+M){
                String str = br.readLine();
                try{
                    int poketNum = Integer.parseInt(str);
                    String poketName = nameMap.get(poketNum);
                    sb.append(poketName).append("\n");
                }catch(NumberFormatException e){
                    String poketName = str;
                    int poketNum = numMap.get(poketName);
                    sb.append(poketNum).append("\n");
                }
            }
        }

        System.out.print(sb.toString().trim());
    }
}
