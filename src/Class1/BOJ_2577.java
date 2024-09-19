package Class1;

import java.io.*;

public class BOJ_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());
        int[] count = new int[10]; // 0~9까지의 숫자의 count가 0으로 초기화된 배열
        int result = num1 * num2 * num3;

        while(result > 0){
            int component = result %10;
            count[component]++;
            result /= 10;
        }

        for (int j : count) sb.append(j).append("\n");

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
