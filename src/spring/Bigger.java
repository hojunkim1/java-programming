package spring;

import java.util.Scanner;

public class Bigger {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a : ");
        int a = stdIn.nextInt();
        System.out.print("b : ");
        int b = stdIn.nextInt();

        int bigger = getBigger(a, b);
        System.out.println(bigger);
    }

    public static int getBigger(int a, int b) {
        int bigger;
        if (a > b) {
            bigger = a;
        } else {
            bigger = b;
        }
        return bigger;
    }
}
