package inheritance_temp;

import Inheritance.Vehicle;

public class Truck extends Vehicle {
    int capacity;
    public void print(){
        System.out.println("Vehicle- " + "color: "+ Getcolor() + "," + " speed: "+ speed + "," + " Capacity: " + capacity);
    }

}
