package step3.q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            int num1 = s.nextInt();
            int num2 = s.nextInt();
            System.out.println(num1 + num2);
        }
    }
}
