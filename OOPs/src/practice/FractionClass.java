package practice;

public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4,2);
        Fraction f2 = new Fraction(3, 6);
//        f2.print();
//        f2.simplify();
//      f2.increment();
//      f2.print();
//      f1.decrement();
//      f1.print();

        f1.add(f2);
        f1.print();
        Fraction f3 = Fraction.add(f1,f2);
        f3.print();
//        Fraction f4 = Fraction.sub(f1,f2);
//        f4.print();
//        Fraction f5 = Fraction.multiply(f1,f2);
//        f5.print();
    }
}
