import java.util.Scanner;

public class CountZeroes_recursive {
    public static int countzeroes(int n){
        if(n==0){
            return 1;
        }
        return count( n);
    }
    public static int count (int n){
        if(n==0){
            return 0;
        }
        int digit = n%10;
        if(digit==0){
            return 1+ count(n/10);
        }
        return 0+ count(n/10);
    }
    public static int countZerosRec(String input) {
        // Base case: if the string is empty, return 0
        if (input.length() == 0) {
            return 0;
        }

        // Check if the first character is '0' and count it if it is
        int count = (input.charAt(0) == '0') ? 1 : 0;

        // Recursive call for the rest of the string
        return count + countZerosRec(input.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digit");
        int n = sc.nextInt();
        System.out.println(countzeroes(n));
    }
}
