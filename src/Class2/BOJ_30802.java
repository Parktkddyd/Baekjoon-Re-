package Class2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer strSize = new StringTokenizer(br.readLine());
        StringTokenizer strCount = new StringTokenizer(br.readLine());

        int tBundle = Integer.parseInt(strCount.nextToken());
        int penBundle = Integer.parseInt(strCount.nextToken());

        int[] sizeCount = new int[6];
        int idx= 0;
        while(strSize.hasMoreTokens()){
            sizeCount[idx] = Integer.parseInt(strSize.nextToken());
            idx++;
        }

        int minTBundles = 0;
        int maxPenBundles = 0;

        //calc Tshirt minimun bundles
        for(int i=0; i<sizeCount.length; i++){
            int quotient = sizeCount[i] / tBundle;
            int remainder = sizeCount[i] % tBundle;

            minTBundles += quotient;

            if(remainder > 0){
                minTBundles += 1;
            }
        }
        //calc pen maximum bundles
        maxPenBundles = N/penBundle;

        bw.write(String.valueOf(minTBundles));
        bw.newLine();
        bw.write(maxPenBundles +" "+ N%penBundle);
        bw.flush();
        bw.close();

    }
}
