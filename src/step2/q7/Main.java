package step2.q7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int int1 = s.nextInt();
        int int2 = s.nextInt();
        int int3 = s.nextInt();

        if (int1 == int2 && int2 == int3) {
            System.out.println(10000 + int1 * 1000);
        } else if (int1 == int2 || int1 == int3) {
            System.out.println(1000 + int1 * 100);
        } else if (int2 == int3) {
            System.out.println(1000 + int2 * 100);
        } else {
            int max = Math.max(int1, int2);
            max = Math.max(max, int3);
            System.out.println(max * 100);
        }
    }
}
