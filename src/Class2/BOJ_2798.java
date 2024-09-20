package Class2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer number = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(number.nextToken());
        int value = Integer.parseInt(number.nextToken());

        String[] strCardArray = br.readLine().split(" ");
        int[] cardArray = new int[count];

        for(int i=0; i<cardArray.length; i++)
            cardArray[i] = Integer.parseInt(strCardArray[i]);

        int max = 0;
        for(int j=0; j<cardArray.length-2; j++){
            if(cardArray[j] > value) continue;
            for(int k=j+1; k<cardArray.length-1; k++){
                if(cardArray[j] + cardArray[k] > value) continue;
                for(int l=k+1; l<cardArray.length; l++){
                    int sum = cardArray[j] +cardArray[k] + cardArray[l];
                    if(sum <= value && sum> max){
                        max = sum;
                    }
                }
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
