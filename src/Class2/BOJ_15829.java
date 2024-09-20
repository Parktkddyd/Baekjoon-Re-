package Class2;

import java.io.*;
import java.math.BigInteger;

public class BOJ_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = 1234567891;
        int r = 31;
        BigInteger sum = new BigInteger("0");
        BigInteger result = new BigInteger("0");

        char[] Array = br.readLine().toCharArray();
        int[] numArray = new int[Array.length];
        for(int i=0; i<numArray.length; i++){
            numArray[i] = Array[i] - 'a' +1;
        }


            for(int i=0; i<numArray.length; i++){
                BigInteger num = new BigInteger("1");
                for(int j=0; j<i;j++){
                    num = num.multiply(new BigInteger("31"));
                }
                sum = sum.add(num.multiply(new BigInteger(String.valueOf(numArray[i]))));
            }

            result = sum.mod(BigInteger.valueOf(M));



        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
