import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("원화를 입력하세요(단위 원)>>");
        float us = stdIn.nextFloat();
        System.out.println(us + "원은 $" + us / 1100 + "입니다.");
    }
}
