package Class3;

import java.io.*;
import java.util.*;

public class BOJ_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, String> passMap = new HashMap<>();
        for(int i = 0; i<N+M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            if(i < N) {
                passMap.put(st.nextToken(), st.nextToken());
            }else{
                sb.append(passMap.get(st.nextToken())).append("\n");
            }
        }
        System.out.print(sb.toString().trim());
    }
}
