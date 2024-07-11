import java.util.Scanner;

public class closestindex {
    public static int binarySearchClosest(int []nums ,int target) {
             int left =0;
        int right= nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if( nums [mid]== target){
                return mid;
            }
            else if(nums[mid]>target){
                right= mid-1;
            } else {
                left = mid+1;
            }
        }
        if(right<0){
            return left;
        }
        if(left>=nums.length){
            return right;
        }

        if(target- nums[right]<= nums[left]-target){
            return right;
        } else {
            return left;
        }
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
        System.out.println("closest index is" + binarySearchClosest(arr,target));
    }
}
