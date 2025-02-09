package Polymorphism;

public class ShapeUse {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(34, 50);
        r1.info();
        r2.info("rectangle");
    }
}
