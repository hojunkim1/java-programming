package autumn.hw2;

import java.util.Scanner;

public class SimpleStrNumTest {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("다음과 같이 식을 입력하여 결과를 받을 수 있습니다: a + b");
        System.out.println("(단, 가능 연산자는 +, -, *, /)\n");

        do {

            System.out.print("식을 입력해주세요: ");
            SimpleStrNum a = new SimpleStrNum(stdIn.next());
            String op = stdIn.next();
            SimpleStrNum b = new SimpleStrNum(stdIn.next());

            switch (op) {
                case "+" -> {
                    System.out.println(a.add(b));
                }
                case "-" -> {
                    System.out.println(a.subtract(b));
                }
                case "*" -> {
                    System.out.println(a.multiply(b));
                }
                case "/" -> {
                    System.out.println(a.divide(b));
                }
                default -> {
                    System.err.println("Invalid operator.");
                }
            }

            System.out.print("나가시겠습니까? (quit/any): ");
        } while (!stdIn.next().equals("quit"));

        stdIn.close();
    }
}
