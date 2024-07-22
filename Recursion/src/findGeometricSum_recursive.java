import java.util.Scanner;

public class findGeometricSum_recursive {
    public static double findGeometricSum( int k){
        // Write your code here
        if(k==0){
            return 1;
        }
        double sum = 1.0/ Math.pow(2, k);
        return sum + findGeometricSum(k-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter power or value of k");
      int n = sc.nextInt();
        System.out.println(findGeometricSum(n));
    }
}
