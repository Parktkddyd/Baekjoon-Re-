package Class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class BOJ_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        List<Integer> numArr = Arrays.stream(s).
                        mapToInt(Integer::parseInt).
                        boxed().
                        collect(Collectors.toList()); //{2, 4, -10, 4, -9

        Set<Integer> set = new HashSet<>(numArr);

        ArrayList<Integer> sortedList = new ArrayList<>(set);

        Collections.sort(sortedList); //{-10 -9, 2, 4}

        for(int i=0; i<sortedList.size(); i++){
            map.put(sortedList.get(i), i);
        }

        for(int i=0; i<numArr.size(); i++){
            sb.append(map.get(numArr.get(i))).append(" ");
        }

        System.out.print(sb.toString().trim());


    }
}
