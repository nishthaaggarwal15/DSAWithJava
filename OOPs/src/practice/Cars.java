package practice;

public class Cars {
    public static void main(String[] args) {
        Car c1 = new Car("toyota", 250);
        Car c2 = new Car("creta");
        Car c3 = new Car();
        Car.carcount= 10;// we can set the value by ourseleves also
        c1.carcount= 11; // in this way tooo but it is not prefered to do like this
        c1.name = "ferrari";
//        c1.print();
//        c2.print();
//        c3.print();
        int a = Integer.MIN_VALUE;// min value is also a static variable
//        System.out.println(c1.maxspeed);
//        System.out.println(c2.maxspeed);// not the ideal way to acess static variable
        System.out.println(Car.maxspeed); // ideal way to acess static variable
        System.out.println(Car.carcount);

    }
/*class new_Car {
    public static void main (String[] args) {
        Car c=new Car();
        Car.year=2018;
        c.company_name="KIA";
        Car d=new Car();
        System.out.print(d.year);
    }

 */
}
