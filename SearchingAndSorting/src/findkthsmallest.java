import java.util.Scanner;

public class findkthsmallest {
    public static int Sort (int arr[],int k){
        int n = arr.length;
        for(int i =0; i< n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
      return arr[k-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the capacity of the array");
        int cap = sc.nextInt();
        int arr[]= new int[cap];
        for( int i =0 ; i<cap; i++){
            System.out.println("enter the value of " + i + "index");
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the value of k for kth smallest  number");
        int k = sc.nextInt();
        System.out.println( k+ "th smallest number is" + Sort(arr,k));

    }
}
