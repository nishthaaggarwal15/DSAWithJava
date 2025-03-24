package Generics;

public class Vehicle implements PrintInterface {
    int speed;
    String name;
    public Vehicle(int speed, String name){
        super();
        this.speed = speed;
        this.name = name;
    }
    public  void print(){
        System.out.println(speed+" "+ name);
    }
}
