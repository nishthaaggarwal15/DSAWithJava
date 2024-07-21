import java.util.Scanner;

public class CheckArrayIsSortedOrNot_recursive {
    public static boolean Check(int arr[], int size){
        if(size==0 || size==1){
            return true;
        }
        if(arr[size-2]>arr[size-1]){
            return false;
        }
        return Check(arr,size-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for ( int i =0; i<n; i++){
            System.out.println("enter the value of " + i + "element");
            arr[i]= sc.nextInt();
        }
       boolean res=  Check(arr,n);
        if(!res){
            System.out.println("array is not sorted");
        }
        else{
            System.out.println("array is sorted");
        }
    }
}
