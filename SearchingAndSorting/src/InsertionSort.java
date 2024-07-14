import java.util.Scanner;

public class InsertionSort {
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i =1; i<n-1;i++){
            int j = i+1; int temp =arr[i];
            //shifting the element to the right if element is greater than temp
            while(arr[j]>temp && j>=0){
                arr[j+1]= arr[j];
                j--;
            }
            //placing temp element at correct place
            arr[j+1]=temp;
        }
        for( int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the capacity for the array");
        int cap = sc.nextInt();
        int arr[] = new int[cap];
        for(int i =0; i<cap;i++){
            System.out.println("enter the value of "+ i+"th element");
            arr[i]=sc.nextInt();
        }
        System.out.println("sorted array is:");
        for(int i :arr){
            System.out.print(i+" ");
        }
        System.out.println("sorted array is:");
        sort(arr);
    }
}
