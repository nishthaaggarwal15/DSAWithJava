package practice;

public class Car {
    String name;
    int speed;
    public Car( String name, int speed){ // constructor for object who should have name and speed both
        this.name= name;
        this.speed= speed;
    }
    public Car (String name){ // comnstructor who should only have a name
        this.name = name;
    }
    public Car (){ // to have default values;
        name = "maruti";
        speed = 100;
    }
    public void print(){
        if(speed <=0){
            System.out.print(name+ " doesn't have speed yet ");
        } else {
            System.out.print(name + " have the speed of : " + speed);
        }
        System.out.println();
    }
}
