package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class BOJ_18870_no_Set {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        int[] numArr = Arrays.stream(s).
                mapToInt(Integer::parseInt).
                toArray(); //{2, 4, -10, 4, -9


        //sol1, stream to sort
        int[] sortedArray = Arrays.stream(numArr).sorted().toArray();

        //sol2 numArr hard copy and sort

//        int[] sortedArray = Arrays.copyOf(numArr, numArr.length);
//        Arrays.sort(sortedArray);

        int rank = 0;

        for(int i=0; i<sortedArray.length; i++){
            if(!map.containsKey(sortedArray[i])) {
                map.put(sortedArray[i], rank);
                rank++;
            }
        }

        for(int i=0; i<numArr.length; i++){
            sb.append(map.get(numArr[i])).append(" ");
        }

        System.out.print(sb.toString().trim());


    }
}
