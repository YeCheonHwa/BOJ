package step2.q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num >= 1 && num <= 4000) {
            if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
