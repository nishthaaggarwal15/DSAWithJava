package Inheritance;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.Setcolor("black");
        v.print();


        Car c = new Car();
        c.Setcolor("red"); c.speed = 100;
        c.print(); // immediate parent class method
        c.printmaxSpeed();
        Bicycle b = new Bicycle();
        b.Setcolor("red");  b.speed = 10;
  // Both Car and Bicyle class will inherit the properties of Vehicle class and will acess them without intitalizing them seperately in each function again and again
  // Meaning both car and bicycle have color and speed without initalizing them in their funcitons respectively because of inheritance
    }
}
