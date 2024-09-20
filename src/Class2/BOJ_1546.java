package Class2;

import java.io.*;
import java.util.Arrays;

public class BOJ_1546{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] strScore = br.readLine().split(" ");
        double[] score = new double[N];
        double sum = 0.0;
        double avg = 0.0;
        for(int i=0; i<strScore.length; i++){
            score[i] = Double.parseDouble(strScore[i]);
        }
        Arrays.sort(score);
        double maxScore = score[score.length-1];

        for(int j=0; j<score.length; j++){
            double newScore = score[j] / maxScore * 100;
            sum+= newScore;
        }

        avg = sum / N;

        bw.write(String.valueOf(avg));
        bw.flush();
        bw.close();
    }
}
