import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        int[] a = new int[32];
        int[] b = new int[32];
        String[] op = new String[32];

        try {
            int n = readData(a, b, op);
            for (int i = 0; i < n; i++)
                calculate(a[i], b[i], op[i]);
        } catch (IOException e) {
            System.out.println("파일을 읽을 수 없습니다.");
        }
    }

    static int readData(int[] a, int[] b, String[] op) throws IOException {

        File file = new File("test.txt");
        Scanner reader = new Scanner(file, StandardCharsets.UTF_8);

        int i = 0;
        while (reader.hasNextLine()) {
            a[i] = reader.nextInt();
            op[i] = reader.next();
            b[i] = reader.nextInt();
            i++;
        }

        reader.close();
        return i;
    }

    static void calculate(int a, int b, String op) {

        if (op.equals("/") && b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return;
        }

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
