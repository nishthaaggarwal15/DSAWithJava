public class nfactorial {
    public static int fact(int n){
        if (n == 0) {
            return 1;
        }
        int smalloutput = fact(n-1);
        int output = n* smalloutput;
        return output;
    }
    public static int sum (int n){
        if(n==0){
            return 0;
        }
        int smalloutput = sum(n-1);
        int output = n+ smalloutput;
        return output;
    }
    public static void main(String[] args) {
        System.out.println("factorial of n numbers is" +fact(5));
        System.out.println("sum of first  n natural number is"+sum(10));

    }
}
