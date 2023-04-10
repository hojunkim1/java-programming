import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            int a = reader.nextInt();
            String op = reader.next();
            int b = reader.nextInt();
            if (op.equals("/") && b == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                continue;
            }
            calculate(a, b, op);
        }
        reader.close();
    }

    static void calculate(int a, int b, String op) {
        int result = switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
        System.out.println(result);
    }
}
