package Interfaces;



public class Car extends Vehicle implements VehicleInterface , CarInterface{ // class car will have common behaviour from Both the interfaces mentioned here
    @Override
    // if both the interfaces have same methods and there is a clash , then there is no issue we can have same methods in diff interfaces and there will be no issue
    // but for same variable there will be an issue and it will throw an error
    public boolean isMotorized() {
        return false;
    }

    @Override
    public String getCompany() {
        return null;
    }

    @Override
    public int numGears() {
        return 5;
    }
}
// Example
//Problem statement
//interface A{
//    public void method();
//}
//class One{
//    public void method(){
//        System.out.println("Class One method");
//    }
//}
//class Two extends One implements A{
//    public void method(){
//        System.out.println("Class Two method");
//    }
//}
//public class Solution extends Two{
//    public static void main(String[] args){
//        A a = new Two();
//        a.method();
//    }
//}
//Solution description
//In Java, when you have a reference of an interface type (A in this case) pointing to an object of a class that
// implements that interface (Two in this case), the method invoked will be based on the actual type of the object at runtime.
// Here's a breakdown of the code: A a = new Two();: An object of type Two is created, and the reference a of type A is pointing to it.
// a.method();: This calls the method() declared in interface A. However, since Two implements A and overrides the method(),
// the overridden method in Two will be executed.
