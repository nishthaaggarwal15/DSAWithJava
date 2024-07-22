import java.util.Scanner;

public class SumOfDigits_recursive {
    public static int sumOfDigits(int input){
        if(input==0){
            return 0;
        }
        int digit = input%10;
        return digit+ sumOfDigits(input/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digit");
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }
}
