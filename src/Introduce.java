import java.util.Scanner;

public class Introduce {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("학번 : ");
        String number = stdIn.nextLine();
        System.out.print("이름 : ");
        String name = stdIn.nextLine();
        System.out.print("취미 : ");
        String hobby = stdIn.nextLine();
        System.out.print("장래희망 : ");
        String job = stdIn.nextLine();

        System.out.println("--------------------");
        System.out.println("나? " + name + "!");
        System.out.println("학번은 " + number);
        System.out.println(hobby + " 하는 걸 좋아해");
        System.out.println("나는 " + job + "가 되고 싶어!");
        System.out.println("--------------------");
    }
}
