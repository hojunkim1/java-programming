import java.util.Scanner;

public class Exchange {

    final static double usd = 1298.80;
    final static double jpy = 9.94;
    final static double euro = 1398.07;

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("환전 프로그램입니다.");

        int x;
        while (true) {
            System.out.println();
            System.out.println("(1) 달러  (2) 엔화  (3) 유로  (0) 종료");

            do {
                System.out.print("메뉴를 선택하세요>> ");
                x = stdIn.nextInt();
            } while (x < 0 || x > 4);

            if (x == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println();
            System.out.print("원화를 입력하세요(단위 원)>> ");
            double money = stdIn.nextFloat();

            double result;
            if (x == 1) {
                result = exchange(money, usd);
                System.out.println(money + "원은 USD " + result + "입니다.");
            } else if (x == 2) {
                result = exchange(money, jpy);
                System.out.println(money + "원은 JPY " + result + "입니다.");
            } else if (x == 3) {
                result = exchange(money, euro);
                System.out.println(money + "원은 EUR " + result + "입니다.");
            }
        }
    }

    static double exchange(double money, double currency) {
        return Math.round(money / currency * 100) / 100.0;
    }
}
