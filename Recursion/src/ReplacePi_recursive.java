import java.util.Scanner;

public class ReplacePi_recursive {
    public static String replace(String s){
        if(s.length()<=1){
            return s;
        }
        if(s.charAt(0) == 'p' && s.charAt(1)=='i'){
            String smallOutput = replace(s.substring(2));
            return "3.14"+smallOutput;
        }
        return s.charAt(0)+ replace(s.substring(1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String str = sc.nextLine();
        System.out.println(replace(str));
    }
}
