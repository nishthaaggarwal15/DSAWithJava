import java.util.Scanner;

public class RemoveXfromString_recursive {
    public static String removeX(String str){
        if(str.isEmpty()){
            return "";
        }
        char FirstChar = str.charAt(0);
        String restOfString = removeX(str.substring(1));
        if(FirstChar=='x'){
            return  restOfString;
        }
        return FirstChar + restOfString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        System.out.println("Updated String is : " + removeX(str));
    }
}
