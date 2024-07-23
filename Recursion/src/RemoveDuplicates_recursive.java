import java.util.Scanner;

public class RemoveDuplicates_recursive {
    public static String removeDuplicates(String s){
        if(s.length()<=1){
return  s;
        }
        if(s.charAt(0)== s.charAt(1)){
            return removeDuplicates(s.substring(1));
        }
        return s.charAt(0)+ removeDuplicates(s.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String str = sc.nextLine();
        System.out.println("updated string : " + removeDuplicates(str));
    }
}
