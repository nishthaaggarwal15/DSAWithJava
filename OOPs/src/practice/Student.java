package practice;
import hello.parentd;
public class Student {
 private String name; //if we write private before string then
    // it willl be only accesbile in this class and we can't acess it in another class anymore
   private int rollno;
 public void print(){

     System.out.print(name +" rollno is : "+ rollno);
}

    public void setRollno(int rollno) {
     if(rollno<=0){ // by this function i can control over roll no and setting rollno directly to private
         return;
     }
        this.rollno= rollno;
    }

    public int getRollno() {
        return this.rollno;
    }
    public void setName(String name){
     this.name = name;
    }
    public String getName(){
     return this.name; // this keyword define object's property

         }
}
