package Class2;

import java.io.*;

public class BOJ_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 내풀이1. (소인수분해까지는 접근 성공, 다만 2의 개수가 5의 개수보다 무조건 크다는 것을 생각하지 못함)
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        int[] twoAndFive = new int[2];
        int idx = 2;
        int result = 0;
        for(int i=0; i<=N; i++){
            arr[i]= i;
        }

        for(int j = 0; j< arr.length; j++) {
            while(arr[j] > 0){
                if(arr[j]%2 ==0) {
                    twoAndFive[0]++;
                    arr[j] = arr[j] / 2;
                }else if(arr[j]%5 ==0) {
                    twoAndFive[1]++;
                    arr[j] = arr[j] / 5;
                }
                else
                    break;
            }
        }

        if(twoAndFive[0] <= twoAndFive[1]) {
            result = twoAndFive[0];
        }else{
            result = twoAndFive[1];
        }

//        //인터넷 풀이
//        //5의 개수만 알면 되는데, 예시로 N이 25일 경우 5의 배수는 5, 10, 15, 20, 25 순이고
//        //이 경우 각각 5*1, 5*2, 5*3, 5*4, 5*5로 총 5가 6번이 나온 것을 알 수 있음.
//        //N이 5의 배수일 때 마다 5의 제곱꼴이 되므로 5로 나눈 몫이 해당 구간의 5의 개수임을 알 수 있다.
          //위의 말은 즉 25는 5의 2제곱이고, 25를 5로 나누면 몫은 5, 나머지는 5이므로 반복문을 한번 더 수행함. 그러므로 5+1이 된다.
//        while(N >= 5){
//            result += N/5;
//            N /= 5;
//        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }


}
