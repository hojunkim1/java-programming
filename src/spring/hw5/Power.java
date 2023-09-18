package spring.hw5;

public class Power {
    private final int kick;
    private final int punch;

    public Power(int kick, int punch) {
        this.kick = kick;
        this.punch = punch;
    }

    public static void main(String[] args) {
        Power robot = new Power(10, 20);
    }
}
