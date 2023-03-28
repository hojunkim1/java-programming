import java.util.Scanner;

public class Decide {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int num;
        do {
            System.out.print("2자리수 정수 입력(10~99)>>");
            num = stdIn.nextInt();
        } while (num < 10 || num >= 100);

        if (num % 11 == 0) {
            System.out.println("맞아");
        } else {
            System.out.println("아니야");
        }
    }
}
