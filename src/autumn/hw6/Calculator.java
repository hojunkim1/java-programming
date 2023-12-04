package autumn.hw6;

public class Calculator {
    double num1;
    double num2;
    char op;

    public Calculator() {
        this(0, ' ', 0);
    }

    public Calculator(double n1, char o, double n2) {
        num1 = n1;
        op = o;
        num2 = n2;
    }

    public double compute() {
        return switch (op) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> Double.NaN;
        };
    }
}
