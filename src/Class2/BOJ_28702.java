package Class2;

import java.io.*;

public class BOJ_28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //원래 노가다로 했던 풀이
        /*String input1 = br.readLine();
        String input2 = br.readLine();
        String input3 = br.readLine();
        String result =  "";

        switch (input1) {
            case "Fizz":
                if (input3.equals("Buzz") || Integer.parseInt(input3) % 15 == 8 || Integer.parseInt(input3) % 15 == 11)
                    result = "Fizz";
                else
                    result = "FizzBuzz";
                break;
            case "Buzz":
                if (input2.equals("Fizz"))
                    result = String.valueOf(Integer.parseInt(input3) + 1);
                else
                    result = String.valueOf((Integer.parseInt(input2) + 2));
                break;
            case "FizzBuzz":
                result = "Fizz";
                break;
            default:
                int intInput1 = Integer.parseInt(input1);
                if (intInput1 % 15 == 1 || intInput1 % 15 == 4 || intInput1 % 15 == 8 || intInput1 % 15 == 11 || intInput1 % 15 == 13 || intInput1 % 15 == 14)
                    result = String.valueOf(intInput1 + 3);
                else if (intInput1 % 15 == 2 || intInput1 % 15 == 7)
                    result = "Buzz";
                break;
        bw.write(result);
        bw.flush();
        bw.close();
        }*/

        //새로운 방식 풀이
        boolean flag = false;
        int num = 0;

        for(int i=0; i<3; i++){
            String str = br.readLine();
            if(str.charAt(0) != 'F' && str.charAt(0) != 'B'){
                num = Integer.parseInt(str);
                flag = true;
            }
            if(flag)
                num++;
        }

        if(num%3 == 0){
            if(num%5 ==0){
                bw.write("FizzBuzz");
            }else{
                bw.write("Fizz");
            }
        }else{
            if(num%5 == 0){
                bw.write("Buzz");
            }else{
                bw.write(String.valueOf(num));
            }
        }
        bw.flush();
        bw.close();
    }

}
