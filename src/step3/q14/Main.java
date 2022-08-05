package step3.q14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int ori = num1;
        int total = 0;
        while (true) {
            total++;
            a = ori / 10;
            b = ori % 10;
            c = a + b;
            d = c % 10;
            String tt = Integer.toString(b) + Integer.toString(d);
            ori = Integer.parseInt(tt);
            if (ori == num1) {
                break;
            }
        }
        System.out.println(total);
    }
}
