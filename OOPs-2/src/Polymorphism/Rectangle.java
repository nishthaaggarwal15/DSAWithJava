package Polymorphism;

public class Rectangle extends  Shape{
    int length; int breadth;
    Rectangle(){
//        System.out.println("rectangle default constructor");
    }
    Rectangle (int length, int breadth){
        this.breadth = breadth; this.length = length;
    }
    public void draw(){
        System.out.println("Rectangle drawn");
    }
 public  void info (){
     System.out.println("length: "+ length + " breadth: "+ breadth);
 }
 public  void info(String type){
     System.out.println(type + " length: "+ length + " breadth: "+ breadth);
 }
}
