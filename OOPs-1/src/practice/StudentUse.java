package practice;
import hello.parentd; // we have imported another package to acess properties of class of another package
public class StudentUse {
    public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
//    s1.name  = "nishtha"; s1.rollno = 10;
//    s2.name = "nishu"; s2.rollno =12;
s1.setRollno(205);
s1.setName("nishtha");
System.out.print(s1.getName() +" roll no is " + s1.getRollno());
    parentd p1 = new parentd();
      p1.name = "mithlesh";
//      System.out.print("parent of "+ s1.name+ " is " + p1.name); System.out.println();
//    s1.print(); System.out.println();
//    s2.print(); System.out.println();


    }
}
