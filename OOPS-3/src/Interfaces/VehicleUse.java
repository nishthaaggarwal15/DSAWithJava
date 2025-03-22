package Interfaces;
// A CLASS CAN ONLY EXTEND ONE CLASS BUT CAN IMPLEMENT MULTIPLE INTERFACES


public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
      //  VehicleInterface vI = new VehicleInterface() ; we cannot create this because as abstarct is incomplete it is too
        VehicleInterface vI; // we can create the refrence and implement polymorphism
        // we can only access properties which are there in the interface
        // by interface we know that class implemeting interface will have all the functions of the interface, also applied to variables
        // it basically creates an interface for every class that they should have all these properties
    }
}
