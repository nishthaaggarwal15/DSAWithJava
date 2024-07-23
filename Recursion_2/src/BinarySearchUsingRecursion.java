import java.util.Scanner;

public class BinarySearchUsingRecursion {
    public static int Search(int [] arr, int start , int end, int target){
        //base case
        if(start>end){
            return -1;
        }
        int mid = (start+end)/2;
        //condition 1
        if(arr[mid]==target){
            return mid;
        }
        //conditon 2
        else if( arr[mid]>target){
           return Search(arr,start, mid-1, target);
        }
        //condition 3
        return Search(arr,mid+1, end, target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int size= sc.nextInt();
        int arr [] = new int[size];
        for(int i =0; i<size; i++){
            System.out.println("Enter the value of " + i+ " index of array");
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element you want to Search");
        int target = sc.nextInt();
        System.out.println("Element is present at " + Search(arr,0,size-1,target) + " index");
    }
}
