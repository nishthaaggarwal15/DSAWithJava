import java.util.Scanner;

/*
Problem statement
Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in the output array (in increasing order).

Do this recursively. Indexing in the array starts from 0.

Hint:
Try making a helper function with the required arguments and call the helper function from the allIndexes function.
 */
public class AllIndexesOfTarget_recursive {
    public static int[] CountIndexes(int arr[], int x){
        int result[] = new int[arr.length];
        int size = CountIndexes_Helper(arr, x, 0, result, 0);
        int finalresult [] = new int[size];
        for(int i=0; i< size; i++){
            finalresult[i]= result[i];
        }
        return  finalresult;
    }
    public static int CountIndexes_Helper(int arr[], int x, int Index, int result[], int count){
        if(Index == arr.length){
            return  count;
        }
        if(arr[Index]== x){
            result[count]= Index;
            count++;
        }
        return CountIndexes_Helper(arr,x,Index+1, result,count);

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
        int A[]  = CountIndexes(arr,x);
        for(int i : A){
            System.out.print(i+ " ");
        }
    }
}
