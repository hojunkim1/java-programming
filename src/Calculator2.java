import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");
        Scanner reader = new Scanner(file, StandardCharsets.UTF_8);

        while (reader.hasNextLine()) {

            // 파일에서 데이터 읽어오기
            int a = reader.nextInt();
            String op = reader.next();
            int b = reader.nextInt();

            // 0으로 나누는 경우 예외 처리
            if (op.equals("/") && b == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                continue;
            }

            // 연산자에 따라 계산
            int result = switch (op) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default -> 0;
            };

            // 결과 출력
            System.out.println(result);
        }

        reader.close();
    }
}
