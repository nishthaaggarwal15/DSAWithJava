package Generics;

public class Student implements  PrintInterface{
int rollno;
public Student(int rollno){
    this.rollno = rollno;
}
    @Override
    public void print() {
        System.out.println(rollno);
    }
}
