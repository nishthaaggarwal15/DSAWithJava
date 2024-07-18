/*
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.

Do this recursively.
 */

public class calculatepower {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int small = power(x, n-1);
        int output = x* small;
        return output;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }

}
