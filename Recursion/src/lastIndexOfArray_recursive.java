/*
Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.

Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.

You should start traversing your array from 0, not from (N - 1).

Do this recursively. Indexing in the array starts from 0.
 */

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
        System.out.println("Enter the element you want to search");
        int x = sc.nextInt();

            System.out.println("Element found at :" + Find(arr,x)+ " index");

    }
}
