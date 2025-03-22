package inheritance_temp;
import Abstractclass.Vehicle;
public class VehichleUse2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.Setcolor("green");
//        v.speed = 30;
        v.print();
        Truck t = new Truck();
//        t.Setcolor("yellow"); t.speed = 400;
        t.capacity = 120;
        t.print();
    }


}
