import java.awt.Point;

class ColorPoint2 extends Point {

    private String color;

    public ColorPoint2(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public static void main(String[] args) {
        ColorPoint2 cp = new ColorPoint2(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }

    private void setColor(String color) {
        this.color = color;
    }

    private void setXY(int x, int y) {
        super.setLocation(x, y);
    }

    public String toString() {
        return color + "색의 (" + (int) super.getX() + "," + (int) super.getY() + ") 점";
    }
}
