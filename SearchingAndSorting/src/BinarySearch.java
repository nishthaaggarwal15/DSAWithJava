import java.util.Scanner;

public class BinarySearch {
    public static void search( int arr[], int target){
        int left =0;
        int right= arr.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                System.out.println("target element is at" + mid+ "index");
                return;
            } else if ( arr[mid]>target){
                right = mid-1;
            } else if (arr[mid]<target) {
                left= mid+1;
            }
        }
        System.out.println("Target element not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the capacity of array");
        int cap = sc.nextInt();
        int arr[] = new int[cap];
        for(int i =0; i<cap; i++){
            System.out.println("enter the value of " + i+ "th element");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element you want to search");
        int target = sc.nextInt();
        search(arr,target);
    }
}
