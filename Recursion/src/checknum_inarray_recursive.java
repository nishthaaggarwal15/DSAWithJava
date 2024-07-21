import java.util.Scanner;

public class checknum_inarray_recursive {
    public static boolean Search(int arr[], int x){
return Check(arr,x,0);
    }
    public static boolean Check(int arr[], int x, int index){
        if(index==arr.length){
            return false;
        }
        if(arr[index]== x){
            return true;
        }
        return Check(arr,x,index+1);
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
        System.out.println("enter the element you want to search");
        int x = sc.nextInt();

        if(!Search(arr,x)){
            System.out.println("element not found");
        }
        else {
            System.out.println("element found");
        }
    }

}
