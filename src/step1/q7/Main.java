package step1.q7;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(0 > a || b > 10) {
            System.out.println("error");
        } else {
            System.out.println(a*b);
        }
    }
}
