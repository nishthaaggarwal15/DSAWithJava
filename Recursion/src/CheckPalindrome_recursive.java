import java.util.Scanner;

public class CheckPalindrome_recursive {
    public static boolean isPalindrome(String str) {

        return Check(str, 0, str.length()-1);
    }
    public static boolean Check(String str, int start , int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!= str.charAt(end)){
            return false;

        }
        return Check(str, start+1, end-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word you want to check Palindrome of :");
        String str = sc.nextLine();
        if(isPalindrome(str)){
            System.out.println("it is palindrome");
        }
        else {
            System.out.println("it is not palindrome");
        }
    }
}
