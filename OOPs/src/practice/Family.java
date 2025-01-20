package practice;

public class Family {
    String childName; final String MotherName; final String FatherName;
    //finalize the value which cannot be changed again by anyone else
    public  Family( String MotherName, String FatherName){
        this.MotherName = MotherName;
        this.FatherName = FatherName;
    }
    public Family(String childName,String MotherName, String FatherName){
        this(MotherName, FatherName);
        this.childName = childName;
    }
     public void printFamily(){
        System.out.println(childName +" parents name are : "+ "Mother's name : "+ MotherName + " Father's name : "+ FatherName);
    }
}
