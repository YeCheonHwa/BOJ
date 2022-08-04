package step1.q8;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextInt();
        double b = s.nextInt();
        if(0 > a || b > 10) {
            System.out.println("error");
        } else {
            System.out.println(a/b);
        }
    }
}
