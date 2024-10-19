import java.util.Scanner;

/*
Problem statement
Sam always likes to challenge Ninja with some problems. Today, he has come to Ninja for another challenge. Sam took a sorted array and rotated it clockwise by an unknown amount.

For example, he took a sorted array = [1, 2, 3, 4, 5] and if he rotates it by 2, then the array becomes: [4, 5, 1, 2, 3].
After rotating the sorted array, he asked Ninja Q queries, for each query Ninja has to search whether the number asked in that query is present in the rotated array or not, if the number is present then Ninja needs to tell Sam the index of the number, otherwise, he needs to tell Sam -1.

Since Ninja does not want to lose the challenge, he asked you to help him for the same. Your task is to find the index of the number asked in the query if it exists.
 */
public class SearchTheElement_BinarySearch {
    public static int search (int arr[], int key){
        int n = arr.length;
        int low =0;
        int high = arr.length-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]== key){
                return mid;
            }
            if(arr[low]<= arr[mid]){ // left side is sorted
                if(key<arr[mid] && key>= arr[low]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }

            }
            else {
                if(key<=arr[high] && key> arr[mid]) { // right side is sorted
                        low = mid+1;
                } else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int test = s.nextInt();
        while (test-- > 0) {
            int target = s.nextInt();

            int ans = search(arr, target);
            System.out.println(ans);
    }
}}
