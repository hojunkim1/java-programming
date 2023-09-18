import java.util.Scanner;

public interface RemoteControl {

    int MAX_VOLUME = 10;

    int MIN_VOLUME = 0;

    void turnOn();

    void turnOff();

    void setVolume(int volume);
}


class Television implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME)
            this.volume = RemoteControl.MAX_VOLUME;
        else if (volume < RemoteControl.MIN_VOLUME)
            this.volume = RemoteControl.MIN_VOLUME;
        else
            this.volume = volume;
        System.out.println("현재 spring.hw5.TV 볼륨: " + this.volume);
    }
}

class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME)
            this.volume = RemoteControl.MAX_VOLUME;
        else if (volume < RemoteControl.MIN_VOLUME)
            this.volume = RemoteControl.MIN_VOLUME;
        else
            this.volume = volume;
        System.out.println("현재 오디오 볼륨: " + this.volume);
    }
}

class Phone implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("스마트폰을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트폰을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME)
            this.volume = RemoteControl.MAX_VOLUME;
        else if (volume < RemoteControl.MIN_VOLUME)
            this.volume = RemoteControl.MIN_VOLUME;
        else
            this.volume = volume;
        System.out.println("현재 스마트폰 볼륨:" + this.volume);
    }
}

class RemoteControlTest {
    public static void main(String[] args) {

        RemoteControl app = selectApp();
        Scanner stdIn = new Scanner(System.in);

        while (true) {
            int workNum = selectMenu("(1: 전원 켜기, 2: 전원 끄기, 3: 볼륨 조정, 4: 제품 다시 선택, 0: 종료): ", 5);
            if (workNum == 0) break;

            switch (workNum) {
                case 1 -> {
                    app.turnOn();
                    System.out.println("전원이 켜졌습니다.\n");
                }
                case 2 -> {
                    app.turnOff();
                    System.out.println("전원이 꺼졌습니다.\n");
                }
                case 3 -> {
                    System.out.print("볼륨을 선택하세요(0~10): ");
                    int volume = stdIn.nextInt();
                    app.setVolume(volume);
                    System.out.println("전원이 " + volume + "으로 설정되었습니다.\n");
                }
                case 4 -> {
                    System.out.println("제품을 다시 선택합니다.");
                    app = selectApp();
                    System.out.println();
                }
            }
        }

        stdIn.close();
        System.out.println("프로그램이 종료되었습니다.");
    }

    public static RemoteControl selectApp() {

        int appNum;
        do {
            appNum = selectMenu("(1: 텔레비전, 2: 오디오, 3: 스마트폰): ", 4);
        } while (appNum == 0);

        return switch (appNum) {
            case 1 -> new Television();
            case 2 -> new Audio();
            case 3 -> new Phone();
            default -> throw new IllegalStateException("Unexpected value: " + appNum);
        };
    }

    private static int selectMenu(String message, int range) {
        Scanner stdIn = new Scanner(System.in);
        int selectNum = 0;

        do {
            System.out.print(message);
            selectNum = stdIn.nextInt();
        } while (selectNum < 0 || selectNum > range);

        return selectNum;
    }
}