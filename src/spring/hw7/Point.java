package spring.hw7;

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public ColorPoint(int x, int y) {
        super(x, y);
    }

    public ColorPoint() {
        this(0, 0, "BLACK");
    }

    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint();
        System.out.println(zeroPoint.toString());

        ColorPoint cp = new ColorPoint(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }

    public void setXY(int x, int y) {
        move(x, y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return color + "색의 (" + getX() + "," + getY() + ") 점";
    }
}

class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);
        System.out.println(p.toString() + "입니다.");

        p.moveUp();
        System.out.println(p.toString() + "입니다.");

        p.moveDown();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");

        p.move(100, 200, 300);
        System.out.println(p.toString() + "입니다.");
    }

    public void moveUp() {
        z++;
    }

    public void moveDown() {
        z--;
    }

    public void move(int x, int y, int z) {
        move(x, y);
        this.z = z;
    }

    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")의 점";
    }
}

class PositivePoint extends Point {
    public PositivePoint(int x, int y) {
        super(0, 0);
        move(x, y);
    }

    public PositivePoint() {
        this(0, 0);
    }

    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");

        p.move(-5, 5);
        System.out.println(p.toString() + "입니다.");

        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");
    }

    public void move(int x, int y) {
        if (x >= 0 && y >= 0) super.move(x, y);
    }

    public String toString() {
        return "(" + getX() + "," + getY() + ")의 점";
    }
}
