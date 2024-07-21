import java.util.Scanner;

public class lastIndexOfArray_recursive {
    public static int Find(int arr[], int x) {
         return FindIndex(arr,x,arr.length-1);

    }
    public static int FindIndex(int arr[], int x, int index){
        if(arr.length<0){
            return 0;
        }
        if(arr[index]==x){
            return index;
        }
        return FindIndex(arr,x,index-1);
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

            System.out.println("element found at :" + Find(arr,x)+ " index");

    }
}
