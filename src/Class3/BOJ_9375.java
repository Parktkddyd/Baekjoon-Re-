package Class3;
import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class BOJ_9375 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            Map<String, Integer> clothes = new HashMap<>();
            int N = Integer.parseInt(br.readLine());
            for(int j=0; j<N; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                //이름은 중요하지 않고, 타입만 중요
                String name = st.nextToken();
                String type = st.nextToken();
                //옷 종류에 따른 개수가 clothes Map에 담김
                clothes.put(type, clothes.getOrDefault(type, 1)+1);
            }

            int sum = 1;
            Set<String> keySet = clothes.keySet();
            for(String key : keySet){
                sum*=clothes.get(key);
            }

            sb.append(sum-1).append("\n");
        }

        System.out.print(sb.toString().trim());
    }
}
