package Abstractclass;

public  abstract class Vehicle {
  private  String color;
  int maxSpeed;
   protected int speed;// can acess this outside this package by public
    public void Setcolor (String color){
        this.color = color;
    }
    public String Getcolor(){
        return  color;
    }
    public void print(){

        System.out.println("Vehicle- " + "color: "+ Getcolor() + "," + " speed: "+ speed);
    }
    public abstract boolean isMotorized();
    public abstract String getCompany();
}
