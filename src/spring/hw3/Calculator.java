package spring.hw3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        while (true) {
            System.out.print("두 정수와 연산자를 입력하시오>>");
            int a = stdIn.nextInt();
            String op = stdIn.next();
            int b = stdIn.nextInt();

            if (op.equals("/") && b == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                continue;
            }

            int result = calculate(a, b, op);
            if (result != 0)
                System.out.println(a + op + b + "의 계산 결과는 " + result);
            else
                System.out.println("연산자를 잘못 입력하셨습니다.");

            System.out.print("계속 할거야?(안할꺼면 quit)>>");
            String ans = stdIn.next();
            if (ans.equals("quit")) {
                stdIn.close();
                break;
            }
            System.out.println();
        }

        System.out.println("프로그램을 종료합니다.");
    }

    static int calculate(int a, int b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            case "%" -> a % b;
            default -> 0;
        };
    }
}
