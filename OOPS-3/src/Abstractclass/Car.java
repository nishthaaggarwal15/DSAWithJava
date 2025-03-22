package Abstractclass;

public abstract class Car extends Vehicle{ // syntax of inheritance
    int numDoors;
int maxSpeed ;
    @Override
    public void print() {
        super.print();// first run immediate parent class method and then current  class method
        System.out.println("color" + Getcolor() + "speed : " + speed + "no of doors : " + numDoors);
    }
    public  void printmaxSpeed(){
        System.out.println("car maxspeed" + maxSpeed + "vehicle maxspeed: " + super.maxSpeed); // value of maxspeed of immediate parent class
    }
    public  boolean isMotorized(){
     return true;
    }
}
