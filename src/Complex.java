public class Complex {
    private final double RE;
    private final double IM;

    public Complex(double RE, double IM) {
        this.RE = RE;
        this.IM = IM;
    }

    public void show() {
        System.out.println(RE + " + " + IM + "i");
    }

    public Complex plus(Complex operand) {
        return new Complex(this.RE + operand.RE, this.IM + operand.IM);
    }

    public Complex minus(Complex operand) {
        return new Complex(this.RE - operand.RE, this.IM - operand.IM);
    }

    public Complex times(Complex operand) {
        double real = (this.RE * operand.RE) - (this.IM * operand.IM);
        double imaginary = (this.RE * operand.IM) + (this.IM * operand.RE);
        return new Complex(real, imaginary);
    }

    public Complex divide(Complex operand) {
        double real = (this.RE * operand.RE) + (this.IM * operand.IM);
        double imaginary = (this.IM * operand.RE) - (this.RE * operand.IM);
        double parent = (operand.RE * operand.RE) + (operand.IM * operand.IM);
        if (parent == 0) return new Complex(0, 0);
        return new Complex(real / parent, imaginary / parent);
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(10, 20);
        Complex c2 = new Complex(-5, -30);

        Complex c3 = c1.plus(c2);
        Complex c4 = c2.minus(c3);
        Complex c5 = c3.times(c4);
        Complex c6 = c4.divide(c5);

        c3.show();
        c4.show();
        c5.show();
        c6.show();
    }
}
