
/*
Problem statement
Create a class GrandFather that has a parameterized constructor and a grandFatherName attribute.

Create another class Father that inherits the property of GrandFather and has a parameterized constructor with an additional argument fatherName.

Create another class Son that inherits Father's property and has a parameterized constructor with an additional argument sonName and a printName method that prints the sonName,fatherName, and grandFatherName into the format as shown below in SampleOutput 1.

You need to create the object of Son class and pass the value of sonName,fatherName,grandFatherName as 'Saurabh', 'Ramesh', and 'Suresh' respectively and call the printName method.

Sample Output 1 :
sonname:  Saurabh
fathername:  Ramesh
grandfather:  Suresh
Note:
Keep all the attribute value static as  above mention in sample output 1.
 */

class GrandFather {
    static String grandFatherName;

    GrandFather(String grandFatherName) {
        GrandFather.grandFatherName = grandFatherName;
    }
}

class Father extends GrandFather {
    static String fatherName;

    Father(String grandFatherName, String fatherName) {
        super(grandFatherName);
        Father.fatherName = fatherName;
    }
}

class Son extends Father {
    static String sonName;

    Son(String grandFatherName, String fatherName, String sonName) {
        super(grandFatherName, fatherName);
        Son.sonName = sonName;
    }

    static void printName() {
        System.out.println("sonname:  " + sonName);
        System.out.println("fathername:  " + fatherName);
        System.out.println("grandfather:  " + grandFatherName);
    }
}

public class Multilevel_Inheritance {
    public static void main(String args[]) {
        new Son("Suresh", "Ramesh", "Saurabh");
        Son.printName();
    }
}
