import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());


        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            String roomNum = "";
            /*
            1호실 부터 방이 채워지기 때문에 (x,y) 2차원 좌표계에서 y(층수)가 1씩 올라가는 형태
            (입장순서 % 층수)가 0이면, 무조건 마지막 층(y최댓값)에 입장
            (입장순서 % 층수)가 0이 아닐 경우
            몫+1이 x좌표, 나머지가 y좌표가 됨
             */
            if((N%H) ==0)
             roomNum = String.format("%d%02d", H, (N/H));
            else
                roomNum = String.format("%d%02d", (N%H), (N/H+1));

            sb.append(roomNum).append("\n");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();

    }
}
