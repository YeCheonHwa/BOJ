package step2.q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int time1 = s.nextInt();
        int time2 = s.nextInt();
        int mintue = -45 + time2;
        if (mintue < 0) {
            time1 = time1 - 1;
            if (time1 < 0) {
                time1 = 24 + time1;
            }
            mintue = 60 - 45 + time2;
        } else if (mintue == 60) {
            mintue = 0;
        }
        System.out.println(time1 + " " + mintue);
    }
}

