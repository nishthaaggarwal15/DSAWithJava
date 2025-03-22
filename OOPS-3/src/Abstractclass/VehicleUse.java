package Abstractclass;

public class VehicleUse {
    public static void main(String[] args) {
       // Vehicle v = new Vehicle();// cannot create vehicle object becuase it is incomplete
        // coz we have declared it as abstract and we cannot have an incomplete object
        Vehicle v ; // we can create this it is not cretaing an object but a refrence to it
        // refrence use:
        //v.print(); we can use these methods
        // v.isMotorized();



        // the subclass will also be incomplete if the parent class is incomplete
        // so the child class will have only two options- a) to mark itself as incomplete too
        // b) complete itself
//        Car c = new Car();
//
//        Bicycle b = new Bicycle();


    }
}
