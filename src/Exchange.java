import java.util.Scanner;

public class Exchange {

    final static double USD = 1298.80;
    final static double JPY = 9.94;
    final static double EUR = 1398.07;

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("환전 프로그램입니다.");
        System.out.println("원하는 환전을 선택하세요.");

        while (true) {
            System.out.println();
            System.out.println("(1) 달러  (2) 엔화  (3) 유로");

            int x;
            do {
                System.out.print("메뉴를 선택하세요>> ");
                x = stdIn.nextInt();
            } while (x < 0 || x > 3);

            System.out.print("원화를 입력하세요(단위 원)>> ");
            double money = stdIn.nextDouble();

            double result;
            if (x == 1) {
                result = exchange(money, USD);
                System.out.println(money + "원은 USD " + result + "입니다.");
            } else if (x == 2) {
                result = exchange(money, JPY);
                System.out.println(money + "원은 JPY " + result + "입니다.");
            } else if (x == 3) {
                result = exchange(money, EUR);
                System.out.println(money + "원은 EUR " + result + "입니다.");
            }

            System.out.println();
            System.out.print("계속 진행하시곘습니까?(진행:아무키, 마침:no)>> ");
            String str = stdIn.next();

            if (str.equals("no")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }

    static double exchange(double money, double currency) {
        return Math.round(money / currency * 100) / 100.0;
    }
}
