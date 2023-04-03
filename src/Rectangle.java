import java.awt.*;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        while (true) {
            System.out.print("점 (x, y)의 좌표를 입력하시오>>");
            Point p = new Point(stdIn.nextInt(), stdIn.nextInt());

            String location = "(" + p.x + ", " + p.y + ")";
            if (p.x >= 100 && p.x <= 200 && p.y >= 100 && p.y <= 200)
                System.out.println(location + "는 사각형 안에 있습니다.\n");
            else
                System.out.println(location + "는 사각형 밖에 있습니다.\n");

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
}
