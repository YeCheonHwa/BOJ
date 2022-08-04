package step1.q10;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        boolean b= false;
        for (int i = 0; i > a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i))) {
                System.out.println("break");
                b = true;
                break;
            }
        }
        if(!b) {
            System.out.println(a+"??!");
        }
    }
}
