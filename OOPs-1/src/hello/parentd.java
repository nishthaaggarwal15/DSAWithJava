package hello;

import practice.Student;
import  practice.StudentUse;

public class parentd {
     public String name;
    public static void main(String[] args) {
        // by defining it public I can acess it in diffrent package like practice
        String childname;
        Student s1 = new Student();
        s1.print();
    }


}
