package Class2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class BOJ_2108 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> sortedList = null;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            arrayList.add(num);
            hashSet.add(num); //key 집합
            hashMap.put(num, hashMap.getOrDefault(num,0)+1); //key에 따른 value 맵
        }

        sortedList = new ArrayList<>(hashSet);
        Collections.sort(arrayList);
        Collections.sort(sortedList);

        System.out.println(Math.round(Average(arrayList)));
        System.out.println(Middle(arrayList));
        System.out.println(Mode(hashSet, hashMap));
        System.out.print(Arrange(sortedList));
    }

    private static int Arrange(ArrayList<Integer> sortedList) {
        return sortedList.get((sortedList.size()-1)) - sortedList.get(0);
    }

    private static int Mode(HashSet<Integer> hashSet, HashMap<Integer, Integer> hashMap) {
        ArrayList<Integer> arrayList = new ArrayList<>(hashSet);
        ArrayList<Integer> modeIdxList = new ArrayList<>();

        int mode = 0;
        int modeIdx = 0;

        for(int i=0; i<arrayList.size(); i++){
            if(hashMap.get(arrayList.get(i)) > mode)
                mode = hashMap.get(arrayList.get(i));
        }

        for(int i=0; i<arrayList.size(); i++){
            if(hashMap.get(arrayList.get(i)) == mode){
                modeIdxList.add(arrayList.get(i));
            }
        }

        Collections.sort(modeIdxList);
        if(modeIdxList.size() > 1){
            modeIdx = modeIdxList.get(1);
        }else{
            modeIdx = modeIdxList.get(0);
        }
        return modeIdx;
    }

    private static int Middle(ArrayList<Integer> arrayList) {

        return arrayList.get((arrayList.size()-1)/2);
    }

    private static double Average(ArrayList<Integer> arrayList) {
        int sum = 0;
        for(int i : arrayList){
            sum+= i;
        }
        return (double)sum / arrayList.size();
    }
}
