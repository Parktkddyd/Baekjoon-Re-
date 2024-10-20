package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class BOJ_30804 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] numArr = Arrays.stream(str)
                .mapToInt(Integer::parseInt)
                .toArray();

        int max = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int pointer1 = 0;

        for(int i=0; i<numArr.length; i++) {
            int pointer2 = i;
            hashMap.put(numArr[pointer2], hashMap.getOrDefault(numArr[pointer2], 0) + 1);

            //map에 과일이 2종류 초과일 때, pointer1을 pointer2쪽으로 옮겨주면서, 2종류까지로 줄여주는 작업.
            while (hashMap.size() > 2) {
                hashMap.put(numArr[pointer1], hashMap.get(numArr[pointer1]) - 1);
                if (hashMap.get(numArr[pointer1]) == 0)
                    hashMap.remove(numArr[pointer1]);
                pointer1++;
            }

            if (max < pointer2 - pointer1) {
                max = pointer2 - pointer1;

            }
        }
        System.out.print(max+1);
    }

}
