package step3.q4;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine(); //String
        int num = Integer.parseInt(s); //Int
        for (int i = 0; i < num; i++) {
            String str = bf.readLine(); //String
            StringTokenizer st = new StringTokenizer(str); //StringTokenizer인자값에 입력 문자열 넣음
            int a = Integer.parseInt(st.nextToken()); //첫번째 호출
            int b = Integer.parseInt(st.nextToken()); //두번째 호출
            bw.write(Integer.toString(a+b));
            bw.newLine();
        }
        bw.flush(); //스트림 닫기
        bw.close();
    }
}
