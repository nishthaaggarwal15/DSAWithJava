public class fibonacci_recursive {
    public static int recursive(int n){
        if(n==1|| n==2){

            return 1;

        }
        int fib_1 = recursive(n-1);
        int fib_2= recursive(n-2);
        int fib = fib_1+ fib_2;

        return fib;
    }
    public static void main(String[] args) {
        System.out.println("sum of first n fibonacci numbers : "+ recursive(5));
    }
}
