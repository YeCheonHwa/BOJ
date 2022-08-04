package step1.q13;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        s.nextLine();
        int b = s.nextInt();

        int x,y,z;
        x = b / 100;
        y =  (b % 100) / 10;
        z = ((b % 100) % 10);

        System.out.println(a*z);
        System.out.println(a*y);
        System.out.println(a*x);
        System.out.println(a*b);
    }
}
