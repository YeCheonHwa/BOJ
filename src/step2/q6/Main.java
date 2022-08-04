package step2.q6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int time1 = s.nextInt();
        int time2 = s.nextInt();
        s.nextLine();
        int time3 = s.nextInt();
        int mintue = time2 + time3;
        int tm = mintue / 60;

        time1 = time1 + tm;
        time2 = mintue % 60;
        if(time1 > 23) {
            time1 = 0 + time1 - 24;
        }
        System.out.println(time1 + " " + time2);
    }
}
