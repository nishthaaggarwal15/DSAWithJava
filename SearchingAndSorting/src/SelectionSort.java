import java.util.Scanner;

public class SelectionSort {
    public static void Sort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j = i+1; j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }}
                int temp = arr[i];
                arr[i]= arr[min];
                arr[min]= temp;

    }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the capacity of the array");
        int cap = sc.nextInt();
        int arr [] = new int[cap];
        for(int i =0; i<cap; i++){
            System.out.println("enter the value of"+ i+"th element");
            arr[i]= sc.nextInt();
        }
        System.out.println("Given array is:");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sorted array is:");
        Sort(arr);
    }
}
