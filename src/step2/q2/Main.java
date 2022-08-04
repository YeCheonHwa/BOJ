package step2.q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num >= 90) {
            System.out.println("A");
        } else if (num >= 80) {
            System.out.println("B");
        } else if (num >= 70) {
            System.out.println("C");
        } else if (num >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
