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

    public Complex add(Complex operand) {
        return new Complex(this.RE + operand.RE, this.IM + operand.IM);
    }

    public Complex minus(Complex operand) {
        return new Complex(this.RE - operand.RE, this.IM - operand.IM);
    }

    public Complex multiply(Complex operand) {
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

        c1.add(c2).show();
        c1.minus(c2).show();
        c1.multiply(c2).show();
        c1.divide(c2).show();
    }
}
