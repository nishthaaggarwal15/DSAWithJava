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
