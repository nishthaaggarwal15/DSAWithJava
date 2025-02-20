package Polymorphism;

public class ShapeUse {
    public static void main(String[] args) {
//        Rectangle r1 = new Rectangle();
//        Rectangle r2 = new Rectangle(34, 50);
//        r1.info();
//        r2.info("rectangle");
        Shape s = new Shape();
        s.draw();


        //runtime polymorphism
        Shape s2 = new Circle();
        s2.draw(); // circle will be drawn because it is refering to circle
//        s2.radius; // it will not be available because every shape has a draw method but every shape doesn't have a radius
        s2 = new Rectangle();
        s2.draw(); // it will draw a rectangle







//        s2= new Rectangle(); // we can write this because they both are shape
//        Circle c = new Circle();
//        c.draw();
//        Rectangle r = new Rectangle();
//        r.draw();
    }
}
