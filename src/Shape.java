interface Shape {
    final double PI = 3.14;

    void draw();

    double getArea();

    default public void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Shape donut = new Circle(10); // 반지름이 10인 원 객체
        donut.redraw();
        System.out.println("면적은 " + donut.getArea());
    }

    @Override
    public void draw() {
        System.out.println("반지름이 " + radius + "인 원입니다.");
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}

class Oval implements Shape {

    private int a;
    private int b;

    public Oval(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println(a + "x" + b + " 에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() {
        return PI * a * b;
    }
}

class Rect implements Shape {

    private int a;
    private int b;

    public Rect(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println(a + "x" + b + " 크기의 사각형 입니다.");
    }

    @Override
    public double getArea() {
        return a * b;
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Shape[] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10, 40);

        ShapeTest.display(list);
    }

    private static void display(Shape[] list) {
        for (Shape shape : list) shape.redraw();
        for (Shape shape : list) System.out.println("면적은 " + shape.getArea());
    }
}
