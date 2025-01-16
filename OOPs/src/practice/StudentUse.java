package practice;
import hello.parentd; // we have imported another package to acess properties of class of another package
public class StudentUse {
    public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    teacher t1= new teacher();
    s1.name  = "nishtha"; s1.rollno = 10;
    s2.name = "nishu"; s2.rollno =12;
    t1.name = "megha";
    parentd p1 = new parentd();
      p1.name = "mithlesh";
      System.out.print("parent of "+ s1.name+ " is " + p1.name); System.out.println();
    s1.print(); System.out.println();
    s2.print(); System.out.println();
    System.out.println(t1.name +" teaches "+ s1.name +" and "+ s2.name +" java ");
    }
}
